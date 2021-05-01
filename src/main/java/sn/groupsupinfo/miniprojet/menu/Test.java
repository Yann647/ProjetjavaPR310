/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupsupinfo.miniprojet.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sn.groupsupinfo.miniprojet.Etudiant;
import sn.groupsupinfo.miniprojet.implementation.EtudiantImp;
import sn.groupsupinfo.miniprojet.implementation.GroupImp;
import sn.groupsupinfo.miniprojet.implementation.ProfesseurImp;

/**
 *
 * @author YANN
 */
public class Test {
    public static void main(String[] args)
    {
        EtudiantImp etudiantImp = new EtudiantImp();      
        ProfesseurImp profImp = new ProfesseurImp();
        GroupImp groupImp = new GroupImp();
        
        List<Etudiant> etudiantsMat = new ArrayList<>();
        
        boolean var = true;
        
        while (var) 
        {
             System.out.println("Menu");
        
        System.out.println("1/ Gestion étudiants");
        System.out.println("2/ Gestion professeurs");
        System.out.println("3/ Gestion groupe");
        System.out.println("4/Quitter");
        
        System.out.println("Veullez choisir une option: ");
        
        Scanner scanner = new Scanner(System.in);
        
        int choix = scanner.nextInt();
        
            switch (choix)
            {
            case 1:
                boolean var1 = true;
                while(var1)
                {
                    
                   System.out.println("****ETUDIANT****");
                   System.out.println("1/ Ajoutez un Etudiant");
                   System.out.println("2/ Modifiez un Etudiant");
                   System.out.println("3/ Supprimez un Etudiant");
                   System.out.println("4/ Affichez un Etudiant");
                   System.out.println("5/Quitter");
                   
                   System.out.println("choix: ");
                   
                   int choixEtudiant = scanner.nextInt();
                   
                   switch(choixEtudiant)
                   {
                       case 1:
                           
                           
                           
                   }
                    
                }
            }
            
        }
        
        
    }
    
}
