/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupsupinfo.miniprojet.interfaces;

import sn.groupsupinfo.miniprojet.Etudiant;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author YANN
 */
public interface iEtudiant {
    void addEtudiant(Etudiant etudiant);
    void updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(int id);
    Etudiant getEtudiantById(int id);
    List<Etudiant> getAllEtudiant();
    List<Etudiant>listEtudiant = new ArrayList<>();
    
}
