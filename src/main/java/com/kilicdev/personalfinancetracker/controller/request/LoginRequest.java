package com.kilicdev.personalfinancetracker.controller.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginRequest {
  @NotNull private String userNameOrEmail;
  @NotNull private String password;
}
