/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupsupinfo.miniprojet.interfaces;

import sn.groupsupinfo.miniprojet.Professeur;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author YANN
 */
public interface iProfesseur {
    void addProfesseur(Professeur professeur);
    void updateProfesseur (Professeur professeur);
    void deleteProfesseur (int id);
    Professeur getProfesseurById(int id);
    List<Professeur> getAllProfesseur();
    List<Professeur> listProfesseur = new ArrayList<>();
    
}
