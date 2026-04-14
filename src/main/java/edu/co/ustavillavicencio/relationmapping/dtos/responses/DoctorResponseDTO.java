package edu.co.ustavillavicencio.relationmapping.dtos.responses;
public class DoctorResponseDTO{
private String name,lastname,specialization,hospitalName;
private int age;
public DoctorResponseDTO(String n,String l,int a,String s,String h){
name=n;lastname=l;age=a;specialization=s;hospitalName=h;}
public String getName(){return name;}
public String getLastname(){return lastname;}
public int getAge(){return age;}
public String getSpecialization(){return specialization;}
public String getHospitalName(){return hospitalName;}
}