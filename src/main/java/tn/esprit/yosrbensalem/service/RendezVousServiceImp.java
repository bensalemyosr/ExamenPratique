package tn.esprit.yosrbensalem.service;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.yosrbensalem.entities.Medecin;
import tn.esprit.yosrbensalem.entities.Patient;
import tn.esprit.yosrbensalem.entities.RendezVous;
import tn.esprit.yosrbensalem.entities.Specialite;
import tn.esprit.yosrbensalem.repository.MedecinRepository;
import tn.esprit.yosrbensalem.repository.PatientRepository;
import tn.esprit.yosrbensalem.repository.RendezVousRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RendezVousServiceImp implements IRendezVousService{

    @Autowired
    MedecinRepository medecinRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    RendezVousRepository rendezVousRepository;

    @Override
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        Medecin medecin = medecinRepository.findById(idMedecin).orElse(null);
        Patient patient = patientRepository.findById(idPatient).orElse(null);
        rdv.setMedecin(medecin);
        rdv.setPatient(patient);

        rendezVousRepository.save(rdv);

    }

    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {
        return rendezVousRepository.findByMedecinCliniquesIdCliniqueAndMedecinSpecialite(idClinique, specialite);
    }

    @Override
    public int getNbrRendezVousMedecin(Long idMedecin) {
        return rendezVousRepository.findByMedecinIdMedecin(idMedecin).size();
    }
}
