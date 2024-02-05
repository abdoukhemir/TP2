/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

/**
 *
 * @author ABDOU
 */
public class Etudiant {

    private String nom;
    private String prenom;
    private String Ninscrit;
    private String email;

    public Etudiant(String nom, String prenom, String Ninscrit, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.Ninscrit = Ninscrit;
        this.email = email;
        
        
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNinscrit() {
        return Ninscrit;
    }

    public void setNinscrit(String Ninscrit) {
        this.Ninscrit = Ninscrit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}   
