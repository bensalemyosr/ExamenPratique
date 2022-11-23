package tn.esprit.yosrbensalem.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.yosrbensalem.entities.Clinique;
import tn.esprit.yosrbensalem.repository.CliniqueRepository;

@Service
@AllArgsConstructor
public class CliniqueServiceImp implements ICliniqueService{

    @Autowired
    CliniqueRepository cliniqueRepository;

    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }
}
