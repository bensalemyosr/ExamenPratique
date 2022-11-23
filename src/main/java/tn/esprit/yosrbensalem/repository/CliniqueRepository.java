package tn.esprit.yosrbensalem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.yosrbensalem.entities.Clinique;

@Repository
public interface CliniqueRepository extends JpaRepository<Clinique,Long> {
}
