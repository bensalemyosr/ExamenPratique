package tn.esprit.yosrbensalem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yosrbensalem.entities.RendezVous;
import tn.esprit.yosrbensalem.entities.Specialite;
import tn.esprit.yosrbensalem.service.IRendezVousService;

import java.util.List;

@RestController
public class RendezVousController {

    @Autowired
    IRendezVousService iRendezVousService;

    @PostMapping("/addRDV/{idMedecin}/{idPatient}")
    public void addRDVAndAssignMedAndPatient(@RequestBody RendezVous rdv,
                                             @PathVariable("idMedecin")Long idMedecin,
                                             @PathVariable("idPatient")Long idPatient){
        iRendezVousService.addRDVAndAssignMedAndPatient(rdv,idMedecin,idPatient);
   }

    @GetMapping("/getRDVByCliniqueAndSpecialite/{idClinique}/{specialite}")
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(@PathVariable("idClinique") Long idClinique,
                                                                 @PathVariable("specialite") Specialite specialite) {
        return iRendezVousService.getRendezVousByCliniqueAndSpecialite(idClinique, specialite);
    }

    @GetMapping("/getNbrRendezVousMedecin/{idMedecin}")
    public int getNbrRendezVousMedecin(@PathVariable("idMedecin")Long idMedecin){
        return iRendezVousService.getNbrRendezVousMedecin(idMedecin);
    }
}
