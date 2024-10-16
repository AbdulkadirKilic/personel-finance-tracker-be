package com.kilicdev.personalfinancetracker.service;

import com.kilicdev.personalfinancetracker.controller.request.RegisterUserRequest;
import com.kilicdev.personalfinancetracker.controller.response.UserResponse;
import com.kilicdev.personalfinancetracker.dto.UserDTO;
import com.kilicdev.personalfinancetracker.enums.ErrorCode;
import com.kilicdev.personalfinancetracker.enums.user.UserStatus;
import com.kilicdev.personalfinancetracker.exception.custom.UserAlreadyExistsException;
import com.kilicdev.personalfinancetracker.mapper.UserMapper;
import com.kilicdev.personalfinancetracker.model.User;
import com.kilicdev.personalfinancetracker.repository.UserRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;
  private final UserMapper userMapper;

  private void validateUserUniqueness(String userName, String email) {
    Optional<User> existingUser = userRepository.findByUserNameOrEmail(userName, email);
    if (existingUser.isPresent()) {

      throw new UserAlreadyExistsException(ErrorCode.USER_ALREADY_EXISTS);
    }
  }

  @Override
  public UserResponse registerUser(RegisterUserRequest registerUserRequest) {
    validateUserUniqueness(registerUserRequest.getUserName(), registerUserRequest.getEmail());
    // todo Fetching the Role entity from the database

    //    Role defaultRole = roleService.findByName("USER")
    //            .orElseThrow(() -> new RuntimeException("Default role not found"));

    User user = new User();
    //user.setRole();//todo default role will assign
    user.setUserName(registerUserRequest.getUserName());
    user.setFirstName(registerUserRequest.getFirstName());
    user.setLastName(registerUserRequest.getLastName());
    user.setEmail(registerUserRequest.getEmail());
    user.setPassword(passwordEncoder.encode(registerUserRequest.getPassword()));
    user.setStatus(UserStatus.ACTIVE);

    userRepository.save(user);

    UserDTO userDTO = userMapper.userToUserDto(user);
    UserResponse userResponse = new UserResponse();
    userResponse.setUserDTO(userDTO);
    userResponse.setResult(true);

    return userResponse;
  }
}
