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
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecin;
    private String nomMedecin;
    private int telephone;
    private int prixConsultation;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @ManyToMany(mappedBy = "medecins",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Clinique> cliniques;

    @OneToMany(mappedBy = "medecin",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<RendezVous> rendezVous;
}
