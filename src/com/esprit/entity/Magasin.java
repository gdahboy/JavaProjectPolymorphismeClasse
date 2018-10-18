/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entity ;
import com.* ;

/**
 *
 * @author wiemhjiri
 */
public class Magasin implements Critere {
    private int idM;
    private String adresse;
    private String nom;
    public static final int CAPACITE_MAX=50;
    private Produit [] prods;//=new Produit[CAPACITE_MAX];
    private int qte_cour=0;
    public static int qte_totale=0;
    public Employe[] emps=new Employe[20];
    public int qte_emp;
    
    public Magasin(){
        this.prods=new Produit[CAPACITE_MAX];
    }    
    
    public Magasin(int idM, String adresse){
        this.idM=idM;
        this.adresse=adresse;
        this.prods=new Produit[CAPACITE_MAX];
    }
    
    public Magasin(int idM, String nom,String adresse){
        this.idM=idM;
        this.nom=nom;
        this.adresse=adresse;
        this.prods=new Produit[CAPACITE_MAX];
    }

    public int getIdM() {
        return idM;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Produit[] getProds() {
        return prods;
    }

    public void setProds(Produit[] prods) {
        this.prods = prods;
    }

    public int getQte_cour() {
        return qte_cour;
    }

    public void setQte_cour(int qte_cour) {
        this.qte_cour = qte_cour;
    }
    
    
    
    public void ajouterProduit(Produit p){
       
         if(!existe(p) && qte_cour<CAPACITE_MAX){
          this.prods[qte_cour]=p;
          qte_cour++;
          qte_totale++;
       
        }else
            System.out.println("Insertion Impossible!!");
    }
    
    public boolean existe(Produit p){
        for(int i=0; i<qte_cour;i++){
            if(prods[i].comparer(p))
                return true;
        }
       return false;
    }
    
    
    public int recherche(Produit p){
        int pos=-1;
        for(int i=0; i<qte_cour; i++){
            if(prods[i].comparer(p))
                pos=i;
        }
        return pos;
    }
    
    public boolean supprimerProduit(Produit p){
        int pos=recherche(p);
        if(pos!=-1 && pos!=CAPACITE_MAX-1){
            for(int i=pos;i<qte_cour-1;i++)
                prods[i]=prods[i+1];
            qte_cour--;
            return  true;
        }else if(pos==CAPACITE_MAX-1)
        {qte_cour--;
        return true;
        }
        else
            return false;
    }
    
    @Override
    public String toString(){
        String s="\n";
        for(int i=0; i<qte_cour;i++)
            s+=prods[i].toString()+"\n";
        s+=" Les employes sont : \n";
        for(int i=0; i<qte_emp;i++)
            s+=emps[i].toString()+"\n";
        return "Magasin ID = "+idM+" , adresse = "+adresse+" \nLes produits sont : "+s;
    }
    
    
    public static Magasin comparerMagasin(Magasin m1, Magasin m2){
        if(m1.qte_cour>m2.qte_cour)
            return m1;
        else 
            return m2;
    }
    
   public void ajouterEmploye(Employe e){
      if( qte_emp<20){
          this.emps[qte_emp]=e;
          qte_emp++;
        }
    }
    public float calculerStock(ProduitFruit P   ){
      float QuantiteTotaleDeFruit = 0.0f ;

        for (int i = 0 ; i < qte_cour ; i++) {
            if (prods[i] != null && prods[i].getClass() == P.getClass() ){
               QuantiteTotaleDeFruit = QuantiteTotaleDeFruit +   prods[i].getQuantite() ;
            }

        }

        return QuantiteTotaleDeFruit ;

    }
    public boolean estfrais(String saison){
        ProduitFruit PF = new ProduitFruit() ;
        ProduitLegume PL = new ProduitLegume() ;
        for (int i = 0 ; i < qte_cour ; i++) {
            if (prods[i] != null && prods[i].getClass() == PL.getClass() ){
                if (saison == prods[i].getSaison() ){
                    System.out.println("ce Legume est frais \n");


                }else {
                    System.out.println("ce legume n'est pas frais \n") ;
                }

            }else if (prods[i] != null && prods[i].getClass() == PF.getClass()){
                if (saison == prods[i].getSaison() ){
                    System.out.println("ce Fruit est frais \n");
                }else {
                    System.out.println("ce Fruit n'est pas frais \n") ;
                }
            }else {
                System.out.println("ce produit ni legume , ni fruit \n");
            }
        }

        return  true ;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
