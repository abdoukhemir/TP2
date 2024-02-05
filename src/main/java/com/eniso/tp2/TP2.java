/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ABDOU
 */
public class TP2 {
    public static void main(String[]args ){
        

        List<Etudiant> etudiants = new ArrayList<>(); 
        
        SystemeGestionEtudiants G1 = new SystemeGestionEtudiants(etudiants) ;
        G1.ajouterEtudiant("ali", "bob", 0, "gmg@gmail.com");
        G1.ajouterEtudiant("ABdou", "KH", 0,"email" );
        G1.afficherEtudiant();
        
        G1.modifierEmailEtudiant(0, "a@a.com");
        G1.supprimerEtudiant(0);
    }
}
    




    