package Td2.Exercice3.EtudeDeCas;

import Td2.Exercice3.universite.Annee;
import Td2.Exercice3.universite.Etudiant;
import Td2.Exercice3.universite.Matiere;
import Td2.Exercice3.universite.UE;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class App {
    public static void main(String agrv[]){

        Matiere m1 = new Matiere("MAT1");
        Matiere m2 = new Matiere("MAT2");
        UE ue1 = new UE("UE1", Map.of(m1, 2, m2, 2));
        Matiere m3 = new Matiere("MAT3");
        UE ue2 = new UE("UE2", Map.of(m3, 1));
        Annee a1 = new Annee(Set.of(ue1, ue2));
        Etudiant e1 = new Etudiant("39001", "Alice", "Merveille", a1);
        e1.noter(m1, 12.0);
        e1.noter(m2, 14.0);
        e1.noter(m3, 10.0);
        System.out.println(e1);
        Etudiant e2 = new Etudiant("39002", "Bob", "Eponge", a1);
        e2.noter(m1, 14.0);
        e2.noter(m3, 14.0);
        Etudiant e3 = new Etudiant("39003", "Charles", "Chaplin", a1);
        e3.noter(m1, 18.0);
        e3.noter(m2, 5.0);
        e3.noter(m3, 14.0);

       afficheSi("Les etudiants pour lesquel le predicat est vrai", e->true,a1);
        //aDef("Les etudiants defaillants",e->true,a1, e1);

    }
    public static void afficheSi(String chaine, Predicate<Etudiant> e1, Annee a1){
        System.out.println(chaine);

        a1.etudiants().forEach(etudiant -> {
            if(e1.test(etudiant))
                System.out.println(etudiant);
        });
    }


    /*public static void aDef(String chaine, Predicate<Etudiant> e1, Annee a1){
        System.out.println(chaine);
                a1.etudiants().forEach(etudiant -> {etudiant.notes();
                    if(e1.test(etudiant))
                        System.out.println(etudiant);
               });
    }
   */
    /*
private static Predicate<Etudiant> aNoteEliminatoire = e->{
        Iterator<Map.Entry<Matiere,Double>>
    }*/

}
