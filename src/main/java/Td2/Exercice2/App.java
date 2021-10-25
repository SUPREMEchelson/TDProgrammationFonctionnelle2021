package Td2.Exercice2;

import java.util.function.Predicate;

public class App {
    public static void main(String arg[]){


        Pair<Integer,Double> Mathieu = new Pair<>(70,170.0);

        Predicate<Integer> tailleTropPetit = taille -> taille <100;
        Predicate<Integer> tailleTropGrand = taille -> taille >200;
        Predicate<Integer> tailleIncorecte = tailleTropGrand.or(tailleTropPetit);
        Predicate<Integer> tailleCorrecte = tailleIncorecte.negate();

        Predicate<Integer> poidsTropLourd = poids -> poids >150;
        Predicate<Integer> poidsCorrecte = poidsTropLourd.negate();

        Predicate<Integer> accessAutoriser = tailleCorrecte.or(poidsCorrecte);


        System.out.println(poidsCorrecte.test(100));
        System.out.println(poidsTropLourd.test(210));
        System.out.println(tailleCorrecte.test(180));
        System.out.println(tailleTropGrand.test(210));
        System.out.println(tailleTropPetit.test(80));
        System.out.println(tailleIncorecte.test(60));



    }
}
