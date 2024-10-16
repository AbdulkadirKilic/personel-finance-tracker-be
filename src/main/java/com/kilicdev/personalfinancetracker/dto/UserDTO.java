package com.kilicdev.personalfinancetracker.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kilicdev.personalfinancetracker.enums.user.UserStatus;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
  private Long id;
  private Long version;
  private Long roleId;
  private String userName;
  private String firstName;
  private String lastName;
  private String email;
  private UserStatus status;
  private LocalDateTime createdDate;
  private String createdBy;
  private LocalDateTime updatedDate;
  private String updatedBy;
}
