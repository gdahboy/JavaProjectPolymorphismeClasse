package com.esprit.entity;

public class ProduitFruit extends Produit {

    private String type ;
    private float quantite ;
    private String saison ;
    public ProduitFruit(){}


    public ProduitFruit(String type , float quantite , String saison , String marque , String libelle , int id , float prix ){
        super(id , libelle  ,marque ,prix );
        this.quantite = quantite ;
        this.saison = saison ;
        this.type = type ;
    }
    public float getQuantite(){
        return this.quantite ;
    }
    public String getSaison(){
        return saison ;
    }
    public String toString(){
        return super.toString()+ "1-type : "+this.type+"\n2-quantite : "+this.quantite+"\n3-saison : "+this.saison ;
    }



}
