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
    ArrayList<Groupe>listGroupe = new ArrayList<Groupe>();

    @Override
    public void addGroupe(Groupe groupe) {
        listGroupe.add(groupe);
    }

    @Override
    public void updateGroupe(Groupe groupe) {
        
    }

    @Override
    public void deleteGroupe(Groupe groupe) {
        listGroupe.remove(groupe);
    }

    @Override
    public Groupe getGroupeById(int id) {
        
    }

    @Override
    public List<Groupe> getAllGroupe() {
        return listGroupe;
    }
    
    
}
