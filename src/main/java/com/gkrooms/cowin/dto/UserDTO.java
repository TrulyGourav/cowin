package com.gkrooms.cowin.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String role;
}