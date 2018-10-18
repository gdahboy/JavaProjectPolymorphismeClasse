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
public class Caissier extends Employe{
    
    private int numCaisse;
    
    
    public Caissier(){ 
       // super();   ligne facultative
        System.out.println("Création de la classe Caissier");}
    
    public Caissier(int numCaisse){
              System.out.println("Création de la classe Caissier");

        this.numCaisse=numCaisse;
    }
    public Caissier(int id, String nom, String adresse, int nbr_heure, int numCaisse ){
    
        super(id,nom,adresse,nbr_heure);
        this.numCaisse=numCaisse;
        System.out.println("Création de la classe Caissier");
    }
    
    @Override
    public String toString(){
        return super.toString()+" Num de Caisse"+numCaisse;
    }

    @Override
    public float calculerSalaire() {
            if(nbr_heure<180)
                return nbr_heure*5;
            else
                return 180*5 + (nbr_heure-180)*5.75f;
    }
    
    
    
}
