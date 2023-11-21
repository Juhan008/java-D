package com.boardTest.users.domain;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
  private int id;
  private String userId;
  private String password;
  private String name;
  private String phone;
  private String address;
  private String email;
  private String gitAddress;
  private int gender;
  private Date birth;
  private Date createdAt;

}
