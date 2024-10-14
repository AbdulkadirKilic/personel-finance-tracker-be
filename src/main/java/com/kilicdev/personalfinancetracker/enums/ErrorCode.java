package com.kilicdev.personalfinancetracker.enums;

import lombok.Getter;

@Getter
public enum ErrorCode {
  INVALID_CREDENTIALS("401", "Unauthorized access", "Username or password is incorrect"),
  USER_NOT_FOUND("404", "Not Found", "User not found");

  private final String code;
  private final String title;
  private final String message;

  ErrorCode(String code, String title, String message) {
    this.code = code;
    this.title = title;
    this.message = message;
  }
}
