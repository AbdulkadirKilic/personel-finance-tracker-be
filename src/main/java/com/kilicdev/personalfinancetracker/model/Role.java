package com.kilicdev.personalfinancetracker.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "role", schema = "finance")
@Getter
@Setter
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_role")
  @SequenceGenerator(name = "seq_role", sequenceName = "finance.seq_role", allocationSize = 1)
  @Column(name = "id")
  private Long id;

  @Column(name = "role_name", unique = true, nullable = false)
  private String roleName;

  @Column(name = "created_date", nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDateTime createdDate;

  @Column(name = "created_by")
  private String createdBy;
}
