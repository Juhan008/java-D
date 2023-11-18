package com.lombok.boardTest.users.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAO {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public void createUserTable() {
    String sql = "CREATE TABLE users (" + "id NUMBER PRIMARY KEY, "
        + "user_id VARCHAR2(50) NOT NULL UNIQUE, " + "password VARCHAR2(64) NOT NULL, "
        + "name VARCHAR2(15) NOT NULL, " + "phone VARCHAR2(14), " + "address VARCHAR2(100), "
        + "email VARCHAR2(100) NOT NULL UNIQUE, " + "git_address VARCHAR2(100), "
        + "gender NUMBER(1), " + "birth DATE, " + "created_at TIMESTAMP" + ")";
    jdbcTemplate.execute(sql);
  }
}
