package com.lombok.boardTest.board.domain;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

  private int id;
  private String userId; // 여기서는 UserVO 대신 userId를 직접 사용합니다.
  private String title;
  private String content;
  private int views;
  private Date createdAt;
  private Boolean isWithdrew;

}
