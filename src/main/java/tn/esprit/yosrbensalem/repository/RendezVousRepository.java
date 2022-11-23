package tn.esprit.yosrbensalem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.yosrbensalem.entities.RendezVous;
import tn.esprit.yosrbensalem.entities.Specialite;

import java.util.List;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {

    List<RendezVous> findByMedecinCliniquesIdCliniqueAndMedecinSpecialite(Long idClinique, Specialite specialite);

    List<RendezVous> findByMedecinIdMedecin(Long idMedecin);

}
