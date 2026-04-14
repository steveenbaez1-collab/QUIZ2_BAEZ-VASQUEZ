package edu.co.ustavillavicencio.relationmapping.entities;
import jakarta.persistence.*;
@Entity
public class Hospital {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
public String getName(){return name;}
}