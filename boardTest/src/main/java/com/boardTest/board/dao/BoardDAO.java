package com.boardTest.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public void createBoardTable() {
    String sql = "CREATE TABLE boards (" + "id NUMBER PRIMARY KEY, " + "user_id NUMBER, "
        + "title VARCHAR2(100) NOT NULL, " + "content LONG NOT NULL, " + "views NUMBER DEFAULT 0, "
        + "created_at TIMESTAMP, " + "is_withdrew NUMBER(1), "
        + "FOREIGN KEY (user_id) REFERENCES users(id)" + ")";
    jdbcTemplate.execute(sql);
  }
}
