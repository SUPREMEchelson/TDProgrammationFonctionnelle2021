package td1.commandes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.ArrayList;

import static td1.commandes.Categorie.*;
import td1.paires.Paire;

public class DAO {
    private List<td1.commandes.Commande> commandes;

    private DAO(td1.commandes.Commande c1, td1.commandes.Commande... cs) {
        commandes = new ArrayList<>();
        commandes.add(c1);
        commandes.addAll(List.of(cs));
    }

    public static DAO instance = null;

    public static final DAO instance() {
        if (instance == null) {
            td1.commandes.Produit camembert = new td1.commandes.Produit("Camembert", 4.0, NORMAL);
            td1.commandes.Produit yaourts = new td1.commandes.Produit("Yaourts", 2.5, INTERMEDIAIRE);
            td1.commandes.Produit masques = new td1.commandes.Produit("Masques", 25.0, REDUIT);
            td1.commandes.Produit gel = new td1.commandes.Produit("Gel", 5.0, REDUIT);
            td1.commandes.Produit tournevis = new td1.commandes.Produit("Tournevis", 4.5, NORMAL);
            //
            td1.commandes.Commande c1 = new td1.commandes.Commande()
                    .ajouter(camembert, 1)
                    .ajouter(yaourts, 6);
            td1.commandes.Commande c2 = new td1.commandes.Commande()
                    .ajouter(masques, 2)
                    .ajouter(gel, 10)
                    .ajouter(camembert, 2)
                    .ajouter(masques, 3);
            //
            instance = new DAO(c1, c2);
        }
        return instance;
    }

    /**
     * liste de toutes les commandes
     */
    public List<td1.commandes.Commande> commandes() {
        return commandes;
    }

    /**
     * ensemble des différents produits commandés
     */
    public Set<td1.commandes.Produit> produits() {
        return commandes.stream()
                .flatMap(c -> c.lignes().stream())
                .map(Paire::fst)
                .collect(Collectors.toSet());
    }

    /*en n'utilisant pas les streams*/
    Set<td1.commandes.Produit> ListProduit = new HashSet<>();
    for(Commande commande :this.commandes)

    {
        for (
                Paire<Produit, Integer> paire : commande.lignes()) {
            ListProduit.add(paire.fst());
        }
    return ListProduit;
    }
    /**
     * liste des commandes vérifiant un prédicat
     */
    public List<Commande> selectionCommande(Predicate<Commande> p) {
        return commandes.stream()
            .filter(p)
            .collect(Collectors.toList());
    }
public List<Commande> selectionCommande(Predicate<Commande> p){
    List<Commande> ListProduits=new ArrayList<>();
    for (Commande c : commandes){
        if(p.test(c))
            ListProduits.add(c);
    }
    return ListProduits;
}



}

    /**
     * liste des commandes dont au moins une ligne vérifie un prédicat
     */
    public List<Commande> selectionCommandeSurExistanceLigne(Predicate<Paire<Produit,Integer>> p) {
        return commandes.stream()
            .filter(c -> c.lignes().stream().anyMatch(p))
            .collect(Collectors.toList());
    }
    /*****************************************/
    public  List<Commande> selectionCommandeSurExistanceLigne(Predicate<Paire<Produit,Integer>> p) {
        List<Commande> ListProduits=new ArrayList<>();
        int i=0;
        for (Commande c : commandes){
            for(Paire<Produit, Integer> paire : c.lignes())
                if(p.test(paire))
                    ListProduits.add(c);
            i+=1;
        }
        return ListProduits;
    }

    /**
     * ensemble des différents produits commandés vérifiant un prédicat
     */
    public Set<Produit> selectionProduits(Predicate<Produit> p) {
        return produits()
            .stream()
            .filter(p)
            .collect(Collectors.toSet());
    }
    /************************************************************************/
    public  Set<Produit> selectionProduits(Predicate<Produit> p) {
        Set<Produit> selectionProduits=new HashSet<Produit>();
        for (Produit produit: produits()){
            if(p.test(produit))
                selectionProduits.add(produit);
        }
        return selectionProduits;
    }

}
