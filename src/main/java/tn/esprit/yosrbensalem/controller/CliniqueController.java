package tn.esprit.yosrbensalem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.yosrbensalem.entities.Clinique;
import tn.esprit.yosrbensalem.service.ICliniqueService;

@RestController
public class CliniqueController {

    @Autowired
    ICliniqueService iCliniqueService;

    @PostMapping("/addClinique")
    public Clinique addClinique(@RequestBody Clinique clinique){
        return iCliniqueService.addClinique(clinique);
    }
}
