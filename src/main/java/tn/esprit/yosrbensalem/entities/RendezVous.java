package tn.esprit.yosrbensalem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Transactional
public class RendezVous implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRDV;
    private String remarque;
    @Temporal(TemporalType.DATE)
    private Date dateRDV;

    @ManyToOne
    private Medecin medecin;

    @ManyToOne
    private Patient patient;

}
