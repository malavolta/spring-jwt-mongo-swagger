package com.experimental.antonio.jwt.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id
  private String id;
  private String username;
  private String email;
  private String password;
  private List<Role> roles;
}
