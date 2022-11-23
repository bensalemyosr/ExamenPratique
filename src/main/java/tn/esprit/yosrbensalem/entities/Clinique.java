package tn.esprit.yosrbensalem.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Transactional
public class Clinique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClinique;
    private String nomClinique;
    private String adresse;
    private int telephone;

    @ManyToMany
    private Set<Medecin> medecins;
}
