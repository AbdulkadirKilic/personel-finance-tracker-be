package com.kilicdev.personalfinancetracker.controller.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponse extends BaseResponse {
  private String userName;
  private String userEmail;
  private String role;
  private String token;  //todo JWT Token management will be done
}
