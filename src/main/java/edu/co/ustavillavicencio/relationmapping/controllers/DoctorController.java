package edu.co.ustavillavicencio.relationmapping.controllers;
import edu.co.ustavillavicencio.relationmapping.dtos.responses.DoctorResponseDTO;
import edu.co.ustavillavicencio.relationmapping.services.DoctorService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/doctor")
public class DoctorController{
private final DoctorService service;
public DoctorController(DoctorService s){this.service=s;}
@GetMapping("/me")
public DoctorResponseDTO me(){return service.getMyInfo();}
}