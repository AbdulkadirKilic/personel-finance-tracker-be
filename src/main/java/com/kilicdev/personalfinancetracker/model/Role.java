package com.kilicdev.personalfinancetracker.model;

import com.kilicdev.personalfinancetracker.enums.role.RoleStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

  @Version
  @Column(name = "version", nullable = false)
  private Long version;

  @Column(name = "name", unique = true, nullable = false)
  private String name;

  @Column(name = "description", nullable = false)
  private String description;

  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  private RoleStatus status;

  @Column(name = "created_date", nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDateTime createdDate;

  @Column(name = "created_by")
  private String createdBy;

  @Column(name = "updated_date")
  @UpdateTimestamp
  private LocalDateTime updatedDate;

  @Column(name = "updated_by")
  private String updatedBy;

  @OneToMany(mappedBy = "role")
  private List<User> users;
}
