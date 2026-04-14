package edu.co.ustavillavicencio.relationmapping.entities;
import jakarta.persistence.*;
@Entity
public class Doctor {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String lastname;
private int age;
private String specialization;
@OneToOne @JoinColumn(name="user_id")
private UserApp user;
@ManyToOne @JoinColumn(name="hospital_id")
private Hospital hospital;
public String getName(){return name;}
public String getLastname(){return lastname;}
public int getAge(){return age;}
public String getSpecialization(){return specialization;}
public UserApp getUser(){return user;}
public Hospital getHospital(){return hospital;}
}