package com.experimental.antonio.jwt.User;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDataDTO {

  private String id;
  
  @ApiModelProperty(position = 0)
  private String username;

  @ApiModelProperty
  private String password;

  @ApiModelProperty(position = 1)
  private String email;
  @ApiModelProperty(position = 2)
  List<Role> roles;
}
