package edu.co.ustavillavicencio.relationmapping.entities;
import jakarta.persistence.*;
@Entity
public class UserApp {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String username;
private String password;
@Enumerated(EnumType.STRING)
private Role role;
public String getUsername(){return username;}
public Role getRole(){return role;}
}