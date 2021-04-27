/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupsupinfo.miniprojet.implementation;

import java.util.ArrayList;
import java.util.List;
import sn.groupsupinfo.miniprojet.Etudiant;
import sn.groupsupinfo.miniprojet.interfaces.iEtudiant;

/**
 *
 * @author YANN
 */
public class EtudiantImp implements iEtudiant {
    
    ArrayList<Etudiant>listEtudiant = new ArrayList<Etudiant>();

    @Override
    public void addEtudiant(Etudiant etudiant) {
        listEtudiant.add(etudiant);
    }

    @Override
    public void updateEtudiant(Etudiant etudiant) {
        for(Etudiant etudiant1:listEtudiant)
        {
            if(etudiant1.getId()==etudiant.getId())
            {
                etudiant1.setMatricule(etudiant.getMatricule());
                etudiant1.setNom(etudiant.getNom());
                etudiant1.setPrenom(etudiant.getPrenom());
                etudiant1.setDateNaissance(etudiant.getDateNaissance());
                etudiant1.setLieuNaissance(etudiant.getLieuNaissance());
                etudiant1.setAdresse(etudiant.getAdresse());
                etudiant1.setTelephone(etudiant.getTelephone());
                etudiant1.setEmail(etudiant.getEmail());
                etudiant1.setNationalite(etudiant.getNationalite());
                etudiant1.setGenre(etudiant.getGenre());
                etudiant1.setGroupeSanguin(etudiant.getGroupeSanguin());
            }
        }
    }

    @Override
    public void deleteEtudiant(Etudiant etudiant) {
        listEtudiant.remove(etudiant);
    }

    @Override
    public Etudiant getEtudiantById(int id) {
       for(Etudiant etudiant:listEtudiant){
           if(etudiant.getId()){
               return etudiant;
           }
       }
       return null;
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return listEtudiant;
    }

    
    
    
    
}
