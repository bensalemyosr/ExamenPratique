package tn.esprit.yosrbensalem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.yosrbensalem.entities.Medecin;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin,Long> {
}
