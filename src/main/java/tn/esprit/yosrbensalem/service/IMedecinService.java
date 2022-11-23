package tn.esprit.yosrbensalem.service;


import tn.esprit.yosrbensalem.entities.Medecin;


public interface IMedecinService {

    public Medecin addMedecinAndAssignToClinique(Medecin medecin,Long CliniqueId);
}
