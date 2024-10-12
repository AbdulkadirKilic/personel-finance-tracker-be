package com.kilicdev.personalfinancetracker.model;

import com.kilicdev.personalfinancetracker.enums.user.UserStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "user", schema = "finance")
@Getter
@Setter
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
  @SequenceGenerator(name = "seq_user", sequenceName = "finance.SEQ_USER", allocationSize = 1)
  @Column(name = "id")
  private Long id;

  @Column(name = "user_name", unique = true, nullable = false)
  private String username;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name ")
  private String lastName;

  @Column(name = "email", unique = true, nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  private UserStatus status;

  @Column(name = "role")
  private String role;

  @Column(name = "create_date", nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDateTime createDate;

  @Column(name = "updated_date")
  @UpdateTimestamp
  private LocalDateTime updatedDate;

  @OneToMany(mappedBy = "user")
  private List<Transaction> transactions;
}
