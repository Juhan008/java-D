package com.boardTest.board.domain;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Board {

  private int id;
  @NonNull
  private String userId;
  @NonNull
  private String title;
  @NonNull
  private String content;
  private int views = 0;
  private int like = 0;
  private int hates = 0;
  private Timestamp createdAt;
  private Boolean isWithdrew = false;

}
