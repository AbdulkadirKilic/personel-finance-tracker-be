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

  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
  @SequenceGenerator(name = "seq_user", sequenceName = "finance.seq_user", allocationSize = 1)
  @Id
  @Column(name = "id")
  private Long id;

  @Version
  @Column(name = "version", nullable = false)
  private Long version;

  @ManyToOne
  @JoinColumn(name = "role_id", nullable = false)
  private Role role;

  @Column(name = "user_name", unique = true, nullable = false)
  private String userName;

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

  @OneToMany(mappedBy = "user")
  private List<Transaction> transactions;
}
