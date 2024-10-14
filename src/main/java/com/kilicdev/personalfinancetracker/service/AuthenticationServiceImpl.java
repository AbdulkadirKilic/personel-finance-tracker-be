package com.kilicdev.personalfinancetracker.service;

import com.kilicdev.personalfinancetracker.controller.request.LoginRequest;
import com.kilicdev.personalfinancetracker.enums.ErrorCode;
import com.kilicdev.personalfinancetracker.exception.custom.InvalidCredentialsException;
import com.kilicdev.personalfinancetracker.model.User;
import com.kilicdev.personalfinancetracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements IAuthenticationService {
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  public boolean authenticateUser(LoginRequest request) {
    User user =
        userRepository
            .findByUserNameOrEmail(request.getUserNameOrEmail())
            .orElseThrow(() -> new InvalidCredentialsException(ErrorCode.INVALID_CREDENTIALS));

    return validatePassword(request.getPassword(), user.getPassword());
  }

  private boolean validatePassword(String rawPassword, String encodedPassword) {
    if (!passwordEncoder.matches(rawPassword, encodedPassword)) {
      throw new InvalidCredentialsException(ErrorCode.INVALID_CREDENTIALS);
    }
    return true;
  }
}
