package edu.co.ustavillavicencio.relationmapping.services;
import edu.co.ustavillavicencio.relationmapping.dtos.responses.DoctorResponseDTO;
import edu.co.ustavillavicencio.relationmapping.entities.*;
import edu.co.ustavillavicencio.relationmapping.repositories.DoctorRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
@Service
public class DoctorService{
private final DoctorRepository repo;
public DoctorService(DoctorRepository r){this.repo=r;}
public DoctorResponseDTO getMyInfo(){
String username=SecurityContextHolder.getContext().getAuthentication().getName();
Doctor d=repo.findByUserUsername(username).orElseThrow();
if(d.getUser().getRole()!=Role.DOCTOR) throw new RuntimeException("No es doctor");
return new DoctorResponseDTO(d.getName(),d.getLastname(),d.getAge(),d.getSpecialization(),d.getHospital().getName());
}
}