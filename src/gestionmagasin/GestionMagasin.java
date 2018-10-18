/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin;

import com.esprit.entity.Caissier;
import com.esprit.entity.Magasin;
import com.esprit.entity.Produit;
import com.esprit.entity.Responsable;
import com.esprit.entity.Vendeur;
import com.esprit.entity.ProduitFruit ;
import com.esprit.entity.ProduitLegume ;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author wiemhjiri
 */
public class GestionMagasin {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Produit p1=new Produit();
      //  p1.afficher();
      
        p1.setId(1021);
        p1.setLibelle("Lait");
        p1.setMarque("Delice");
        
         Produit p2=new Produit(2510, "Yaourt", "Vitalait");
        Produit p3=new Produit(3250, "Tomate", "Sicam", 1.2f);
         Produit p4=new Produit(3250, "Tomate", "Sicam", 1.6f);
        
//        p1.afficher();
//        p2.afficher();
     //   p3.afficher();

        p1.setPrix(0.7f);
        
       // p1.afficher();
        p2.setPrix(0.5f);
     //   p2.afficher();
        
        Date d1=new Date(118, 8, 21);
        p1.setDate_expiration(d1);
        
        
        SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");
        Date d2=sd.parse("2018/09/22");
        
        p2.setDate_expiration(d2);
        
       // System.out.println(p2);
        
        Magasin m1=new Magasin(1, "Carrefour", "Centre Ville");
        Magasin m2=new Magasin(2, "Monoprix", "Menzeh 6");
        
        m1.ajouterProduit(p1);
        m1.ajouterProduit(p2);
        m2.ajouterProduit(p3);
        
//        System.out.println(m1.getQte_cour());
//        System.out.println(m2.getQte_cour());
//        System.out.println(Magasin.qte_totale);
        
      //  System.out.println( Produit.comparer(p2,p3));
//        System.out.println( p1.comparer(p1));
//        System.out.println( p3.comparer(p4));

     //    System.out.println(Magasin.comparerMagasin(m1, m2));
        
        Caissier c1=new Caissier(1,"test","test",40,3);
        Responsable r1=new Responsable(200, 1, "Ben foulen", "ariana", 20);
        Vendeur v1=new Vendeur(30, 1, "BFF", "Ennasr", 30);
        
        m1.ajouterEmploye(c1);
        m1.ajouterEmploye(r1);
        m1.ajouterEmploye(v1);
        
        Responsable r2=new Responsable(200, 2, "Ben foulen 2", "ariana", 20);
        Vendeur v2=new Vendeur(20, 2, "BFF2", "Ennasr", 30);
        Vendeur v3=new Vendeur(40, 3, "BFF3", "Ennasr2", 30);
        Vendeur v4=new Vendeur(10, 4, "BFF4", "EL MANAR", 30);

        m2.ajouterEmploye(r2);
        m2.ajouterEmploye(v2);
        m2.ajouterEmploye(v3);
        m2.ajouterEmploye(v4);

                
     
        for (int i = 0; i < m1.qte_emp; i++) {
            System.out.println(m1.emps[i].calculerSalaire());
        }
        System.out.println("**********************************************************\n\n\n");
        ProduitFruit PF11 =  new ProduitFruit("", 12.3f , "Mars" , "" , "Fraise" , 1254 , 0.0f) ;
        Produit PF1 = (ProduitFruit) new ProduitFruit("", 12.3f , "Mars" , "" , "Fraise" , 1254 , 0.0f) ;
        Produit PF2 = (ProduitFruit) new ProduitFruit("", 50f , "Juin" , "" , "Pasteque" , 1224 , 0.0f) ;
        Produit PF3 = (ProduitFruit) new ProduitFruit("", 25.6f , "Decembre" , "" , "Mandarine" , 7896 , 0.0f) ;
        Produit PL1 = (ProduitLegume) new ProduitLegume("", 14.0f , "Janvier" , "" , "Artichauts" , 8521 , 0.0f) ;
        m1.ajouterProduit(PF1);
        m1.ajouterProduit(PF2);
        m1.ajouterProduit(PF3);
        m1.ajouterProduit(PL1);
        System.out.println("aaaaaaaa");
        m1.ajouterProduit(PF11);

       // System.out.println(m1.recherche(PF1) );
       // System.out.println(m1.getProds());
        Produit produittab[]  = new Produit[m1.getQte_cour()] ;
        produittab = m1.getProds() ;
        for (int i = 0 ; i <m1.getQte_cour() ; i++) {
            System.out.println(i + " ******** \n");
                 System.out.println(  produittab[i].toString() );

        }
        System.out.println("*******");
        System.out.println(m1.calculerStock(PF11));
        System.out.println("*******");
        m1.estfrais("Mars") ; 









    }
    
}
