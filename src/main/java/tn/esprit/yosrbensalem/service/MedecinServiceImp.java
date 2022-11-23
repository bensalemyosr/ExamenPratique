package tn.esprit.yosrbensalem.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.yosrbensalem.entities.Clinique;
import tn.esprit.yosrbensalem.entities.Medecin;
import tn.esprit.yosrbensalem.repository.CliniqueRepository;
import tn.esprit.yosrbensalem.repository.MedecinRepository;

@Service
@AllArgsConstructor
public class MedecinServiceImp implements IMedecinService{

    @Autowired
    MedecinRepository medecinRepository;
    @Autowired
    CliniqueRepository cliniqueRepository;

    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long CliniqueId) {
        Clinique clinique = cliniqueRepository.findById(CliniqueId).orElse(null);
        clinique.getMedecins().add(medecin);
        return medecinRepository.save(medecin);
    }
}
