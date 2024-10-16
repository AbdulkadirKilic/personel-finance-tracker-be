package com.kilicdev.personalfinancetracker.controller.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegisterUserRequest {
  @NotNull private String userName;
  @NotNull private String firstName;
  @NotNull private String lastName;
  @NotNull @Email private String email;
  @NotNull private String password;
}
