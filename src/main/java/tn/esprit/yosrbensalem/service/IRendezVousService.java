package tn.esprit.yosrbensalem.service;

import tn.esprit.yosrbensalem.entities.RendezVous;
import tn.esprit.yosrbensalem.entities.Specialite;

import java.util.List;

public interface IRendezVousService {

    public void addRDVAndAssignMedAndPatient(RendezVous rdv,Long idMedecin,Long idPatient);

    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite);

    public int getNbrRendezVousMedecin(Long idMedecin);

    
}
