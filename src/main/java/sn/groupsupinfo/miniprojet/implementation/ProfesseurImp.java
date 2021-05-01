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
    ArrayList<Professeur> professeurs = new ArrayList<>();

    @Override
    public void addProfesseur(Professeur professeur) {
        professeurs.add(professeur);
    }

    @Override
    public void updateProfesseur(Professeur professeur) {
         for(Professeur professeur1:professeurs)
        {
            if(professeur1.getId()==professeur.getId())
            {
                professeur1.setMatricule(professeur.getMatricule());
                professeur1.setNom(professeur.getNom());
                professeur1.setPrenom(professeur.getPrenom());
                professeur1.setDateNaissance(professeur.getDateNaissance());
                professeur1.setLieuNaissance(professeur.getLieuNaissance());
                professeur1.setAdresse(professeur.getAdresse());
                professeur1.setTelephone(professeur.getTelephone());
                professeur1.setEmail(professeur.getEmail());
                professeur1.setNationalite(professeur.getNationalite());
                professeur1.setGenre(professeur.getGenre());
                professeur1.setSituationMatrimoniale(professeur.getSituationMatrimoniale());
                professeur1.setSpecialite(professeur.getSpecialite());
                
            }
        }
    }

    public void deleteProfesseur(Professeur professeur) {
        professeurs.remove(professeur);
    }

    @Override
    public Professeur getProfesseurById(int id) {
        for(Professeur professeur:professeurs){
            if(professeur.getId()==id){
                return professeur;
            }
        }
        return null;
    }

    @Override
    public List<Professeur> getAllProfesseur() {
        return professeurs;
    }

    @Override
    public void deleteProfesseur(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
