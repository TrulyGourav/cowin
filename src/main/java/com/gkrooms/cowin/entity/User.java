package com.gkrooms.cowin.entity;

import com.gkrooms.cowin.entity.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String password;

    @Column(name = "money_points")
    private Double moneyPoints;

    @Enumerated(EnumType.STRING)
    private Role role;

}

