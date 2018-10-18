package com.esprit.entity;
import com.* ;
import java.util.Date;

public class ProduitLegume extends Produit{
    private String type ;
    private float quantite ;
    private String saison ;

    public ProduitLegume(){

    }

    public ProduitLegume(String type , float quantite , String saison , String marque , String libelle , int id , float prix ){
        super(id , libelle  ,marque ,prix );
        this.quantite = quantite ;
        this.saison = saison ;
        this.type = type ;
    }
    public String toString(){
        return super.toString()+ "1-type : "+this.type+"\n2-quantite : "+this.quantite+"\n3-saison : "+this.saison ;
    }
    public String getSaison(){
        return saison ;
    }

}
