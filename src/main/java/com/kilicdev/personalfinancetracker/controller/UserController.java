package com.kilicdev.personalfinancetracker.controller;

import com.kilicdev.personalfinancetracker.dto.UserDTO;
import com.kilicdev.personalfinancetracker.mapper.UserMapper;
import com.kilicdev.personalfinancetracker.model.User;
import com.kilicdev.personalfinancetracker.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/users")
@RequiredArgsConstructor
public class UserController {

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  // a dummy method to try
  @GetMapping
  public List<UserDTO> getAllUsers() {
    List<User> userList = userRepository.findAll();
    return userList.stream().map(userMapper::userToUserDto).toList();
  }
}
