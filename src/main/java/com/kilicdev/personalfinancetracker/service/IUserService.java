package com.kilicdev.personalfinancetracker.service;

import com.kilicdev.personalfinancetracker.controller.request.RegisterUserRequest;
import com.kilicdev.personalfinancetracker.controller.response.UserResponse;

public interface IUserService {
  UserResponse registerUser(RegisterUserRequest registerUserRequest);
}
