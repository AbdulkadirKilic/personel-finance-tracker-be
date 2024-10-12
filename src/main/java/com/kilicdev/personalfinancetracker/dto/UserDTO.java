package com.kilicdev.personalfinancetracker.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kilicdev.personalfinancetracker.enums.user.UserStatus;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
  private Long id;
  private String userName;
  private String firstName;
  private String lastName;
  private String email;
  private UserStatus status;
  private String role;
  private LocalDateTime createDate;
  private LocalDateTime updatedDate;
  private List<TransactionDTO> transactions;
}
