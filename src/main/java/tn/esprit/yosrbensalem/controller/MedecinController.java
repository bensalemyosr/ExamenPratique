package tn.esprit.yosrbensalem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.yosrbensalem.entities.Medecin;
import tn.esprit.yosrbensalem.service.IMedecinService;

@RestController
public class MedecinController {

    @Autowired
    IMedecinService iMedecinService;

    @PostMapping("/addMedecin/{CliniqueId}")
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin,
                                                 @PathVariable("CliniqueId") Long CliniqueId){
        return iMedecinService.addMedecinAndAssignToClinique(medecin, CliniqueId);
    }
}
