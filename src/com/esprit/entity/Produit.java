/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entity;

import java.util.Date;



/**
 *
 * @author wiemhjiri
 */
public class Produit {
    
    private int id;
    private String libelle;
    private String marque;
    private float prix;
    private Date date_expiration;
    
    public Produit(){}
    
    public Produit(int id, String libelle, String marque){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
    }
    public Produit(int id, String libelle, String marque, float prix){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
    } 
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }
    public float getQuantite() {return 0.0f ; }
    public String getSaison(){return "" ; }

    public void setPrix(float prix) {
        if(prix<0)
            this.prix=0;
       else
            this.prix = prix;
    }

    public Date getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(Date date_expiration) {
        this.date_expiration = date_expiration;
    }
    
    
    
    public void afficher(){
        System.out.println(" Id = "+this.id+" , libelle = "+libelle+" , marque = "+marque+" , prix ="+prix);
    }
    
    
  
    @Override
    public String toString(){
        return " Id = "+this.id+" , libelle = "+libelle+" , marque = "+marque+" "
                + ", prix ="+prix+" , date d'expiration = "+date_expiration;
    }
    
    public boolean comparer(Produit p){
        return this.id==p.id && this.libelle.equals(p.libelle) && this.prix==p.getPrix();
//            return true;
//        return false;
    }
    
    public static boolean comparer(Produit p1,Produit p2){
        if(p1.id==p2.id && p1.libelle.equals(p2.libelle) && p1.prix==p2.getPrix())
            return true;
        return false;
    }
    
    
    
    
    
    
}
