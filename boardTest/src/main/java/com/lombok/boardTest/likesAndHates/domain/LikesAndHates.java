package com.lombok.boardTest.likesAndHates.domain;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LikesAndHates {
  private int id;
  private String userId;
  private int boardId;
  private int likesOrHates;
  private Date createdAt;
}
