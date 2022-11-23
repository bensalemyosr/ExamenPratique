package tn.esprit.yosrbensalem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.yosrbensalem.entities.Patient;
import tn.esprit.yosrbensalem.service.IPatientService;

@RestController
public class PatientController {

    @Autowired
    IPatientService iPatientService;

    @PostMapping("/addPatient")
    public Patient addClinique(@RequestBody Patient patient){
        return iPatientService.addPatient(patient);
    }
}
