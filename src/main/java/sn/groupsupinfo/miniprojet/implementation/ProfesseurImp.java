/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupsupinfo.miniprojet.implementation;

import sn.groupsupinfo.miniprojet.interfaces.iProfesseur;
import java.util.ArrayList;
import java.util.List;
import sn.groupsupinfo.miniprojet.Professeur;

/**
 *
 * @author YANN
 */
public class ProfesseurImp implements iProfesseur {
    ArrayList<Professeur> listProfesseur = new ArrayList<Professeur>();

    @Override
    public void addProfesseur(Professeur professeur) {
        listProfesseur.add(professeur);
    }

    @Override
    public void updateProfesseur(Professeur professeur) {
        
    }

    @Override
    public void deleteProfesseur(Professeur professeur) {
        listProfesseur.remove(professeur);
    }

    @Override
    public Professeur getProfesseurById(int id) {
        
    }

    @Override
    public List<Professeur> getAllProfesseur() {
        return listProfesseur;
    }

    
    
    
    
}
