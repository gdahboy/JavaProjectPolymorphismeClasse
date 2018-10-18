/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entity;

/**
 *
 * @author wiemhjiri
 */
public class Vendeur extends Employe{
    private int tauxDeVente;

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    public Vendeur() {
    }

    public Vendeur(int tauxDeVente, int id, String nom, String adresse, int nbr_heure) {
        super(id, nom, adresse, nbr_heure);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString()+" Vendeur{" + "tauxDeVente=" + tauxDeVente + '}';
    }

    @Override
    public float calculerSalaire() {
            return (450*tauxDeVente)/100;
    
    }
    
    
    
    
    
    
}
