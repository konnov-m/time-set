package com.example.time_set.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Пользователь
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "username")
    String userName;
    String password;

}
