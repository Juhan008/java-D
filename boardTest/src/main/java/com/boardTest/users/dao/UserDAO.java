package com.boardTest.users.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.boardTest.users.domain.User;


@Repository
public class UserDAO {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public void createUserTable() {
    String sql = "CREATE TABLE users (" + "id NUMBER generated as identity PRIMARY KEY, "
        + "user_id VARCHAR2(50) NOT NULL UNIQUE, " + "password VARCHAR2(64) NOT NULL, "
        + "name VARCHAR2(15) NOT NULL, " + "phone VARCHAR2(14), " + "address VARCHAR2(100), "
        + "email VARCHAR2(100) NOT NULL UNIQUE, " + "git_address VARCHAR2(100), "
        + "gender NUMBER(1), " + "birth DATE, " + "created_at TIMESTAMP" + ")";
    jdbcTemplate.execute(sql);
  }

  private RowMapper<User> mapper = new RowMapper<User>() {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
      // TODO Auto-generated method stub
      return new User(rs.getInt("id"), rs.getString("user_id"), rs.getString("password"),
          rs.getString("name"), rs.getString("phone"), rs.getString("address"),
          rs.getString("email"), rs.getString("git_address"), rs.getInt("gender"),
          rs.getDate("birth"), rs.getTimestamp("created_at"));
    }
  };

  public void add(User user) {
    jdbcTemplate.update(
        "insert into users (\"user_id\", \"password\", \"name\", \"phone\", \"address\", \"email\", \"git_address\",\"gender\", \"birth\") values (?, ?, ?, ?, ?, ?, ?, ?, ?)",
        user.getUserId(), user.getPassword(), user.getName(), user.getPhone(), user.getAddress(),
        user.getEmail(), user.getGitAddress(), user.getGender(), user.getBirth());
  }

  public User get(String userId) {
    return jdbcTemplate.queryForObject("select * from users where \"user_id\"=?", mapper, userId);
  }
}
