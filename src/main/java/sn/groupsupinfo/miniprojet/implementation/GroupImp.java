/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupsupinfo.miniprojet.implementation;

import java.util.ArrayList;
import java.util.List;
import sn.groupsupinfo.miniprojet.Groupe;
import sn.groupsupinfo.miniprojet.interfaces.iGroupe;

/**
 *
 * @author YANN
 */
public class GroupImp implements iGroupe {
    ArrayList<Groupe>groupes = new ArrayList<>();

    @Override
    public void addGroupe(Groupe groupe) {
        groupes.add(groupe);
    }

    @Override
    public void updateGroupe(Groupe groupe) {
        for (Groupe groupe1:groupes){
            if (groupe1.getId()==groupe.getId())
            {
                groupe1.setMatricule(groupe.getMatricule());
                groupe1.setNom(groupe.getNom());
            }
        }
    }

    public void deleteGroupe(Groupe groupe) {
        groupes.remove(groupe);
    }

    @Override
    public Groupe getGroupeById(int id) {
        for(Groupe groupe:groupes){
            if(groupe.getId()==id){
                return groupe;
            }
        }
        return null;
    }

    @Override
    public List<Groupe> getAllGroupe() {
        return groupes;
    }

    @Override
    public void deleteGroupe(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
