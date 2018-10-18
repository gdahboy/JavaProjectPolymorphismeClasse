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
public class Responsable extends Employe{
    
    private int prime;

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public Responsable() {
    }

    public Responsable(int prime, int id, String nom, String adresse, int nbr_heure) {
        super(id, nom, adresse, nbr_heure);
        this.prime = prime;
    }

    @Override
    public String toString() {
        return super.toString()+" Responsable{" + "prime=" + prime + '}';
    }

    @Override
    public float calculerSalaire() {
           if(nbr_heure<160)
               return nbr_heure*10+prime;
           else
               return 160*10 + (nbr_heure-160)*12 + prime;
    }
    
    
    
}
