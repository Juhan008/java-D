package com.boardTest.likesAndHates.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LikesAndHatesDAO {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public void createLikesAndHatesTable() {
    String sql = "CREATE TABLE likes_and_hates (" + "id NUMBER generated as identity PRIMARY KEY, "
        + "user_id NUMBER, " + "board_id NUMBER, " + "likes_or_hates NUMBER(1), "
        + "created_at TIMESTAMP, "
        + "constraint fk_user_lah FOREIGN KEY (user_id) REFERENCES users(id), "
        + "constraint fk_board_lah FOREIGN KEY (board_id) REFERENCES boards(id)" + ")";
    jdbcTemplate.execute(sql);
  }
}
