package com.lsolier.udacity.springbootwebsocket.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class User {

  @NotBlank(message = "User name cannot be empty")
  private String name;
}
