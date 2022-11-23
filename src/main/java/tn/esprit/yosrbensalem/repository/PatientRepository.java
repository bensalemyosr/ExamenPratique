package tn.esprit.yosrbensalem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.yosrbensalem.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
