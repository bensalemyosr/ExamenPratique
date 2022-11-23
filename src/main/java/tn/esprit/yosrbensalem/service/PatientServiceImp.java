package tn.esprit.yosrbensalem.service;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.yosrbensalem.entities.Patient;
import tn.esprit.yosrbensalem.repository.PatientRepository;

@Service
@AllArgsConstructor
public class PatientServiceImp implements IPatientService{

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
