package com.kilicdev.personalfinancetracker.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kilicdev.personalfinancetracker.enums.role.RoleStatus;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleDTO {
  private Long id;

  private Long version;

  private String name;

  private String description;

  private RoleStatus status;

  private LocalDateTime createdDate;

  private String createdBy;

  private LocalDateTime updatedDate;

  private String updatedBy;
}
