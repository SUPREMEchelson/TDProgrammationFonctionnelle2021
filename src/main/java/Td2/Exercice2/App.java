package Td2.Exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class App {
    public static void main(String arg[]){

        List<Predicate<Integer>> listePredicat = new ArrayList<Predicate<Integer>>();


        Pair<Double,Integer> Mathieu = new Pair<>(175.0,70);
        Pair<Double,Integer> Angeline = new Pair<>(168.0,68);
        Pair<Double,Integer> Balaji = new Pair<>(210.0,75);
        Pair<Double, Integer> Rigo = new Pair<>(175.0,170);

        Predicate<Integer> tailleTropPetit = taille -> taille <100;
        Predicate<Integer> tailleTropGrand = taille -> taille >200;
        Predicate<Integer> tailleIncorecte = tailleTropGrand.or(tailleTropPetit);
        Predicate<Integer> tailleCorrecte = tailleIncorecte.negate();
        Predicate<Integer> poidsTropLourd = poids -> poids >150;
        Predicate<Integer> poidsCorrecte = poidsTropLourd.negate();

        // Predicat avec des pairs

        Predicate<Pair<Double,Integer>> tailleTropPetitPair = taille -> taille.fst<100;
        Predicate<Pair<Double,Integer>> tailleTropGrandPair = taille -> taille.fst>200;
        Predicate<Pair<Double,Integer>> tailleIncorectePair = tailleTropGrandPair.or(tailleTropPetitPair);
        Predicate<Pair<Double,Integer>> tailleCorrectePair = tailleIncorectePair.negate();
        Predicate<Pair<Double,Integer>> poidsTropLourdPair = poids -> poids.snd >150;
        Predicate<Pair<Double,Integer>> poidsCorrectePair = poidsTropLourdPair.negate();




        BiPredicate<Integer,Integer> accessAutoriser = (taille,poids) -> taille >100 && taille <200 && poids <150;
        BiPredicate<Pair<Double,Integer>,Pair<Double,Integer>> Couple = (Pair<Double,Integer> x,Pair<Double,Integer> y)
                ->  x.fst> 100 && x.fst<200 && y.snd<150;

        /*  Mathieu.listePredicat.add(tailleCorrecte);
        Mathieu.listePredicat.add(tailleIncorecte);
        Mathieu.listePredicat.add(tailleTropGrand);
        Mathieu.listePredicat.add(tailleTropPetit);
*/



/*
        System.out.println(poidsCorrecte.test(100));
        System.out.println(poidsTropLourd.test(210));
        System.out.println(tailleCorrecte.test(180));
        System.out.println(tailleTropGrand.test(210));
        System.out.println(tailleTropPetit.test(80));
        System.out.println(tailleIncorecte.test(60));
        System.out.println(accessAutoriser.test(110,160));
        System.out.println(Couple.test(Mathieu,Angeline));


        System.out.println(tailleCorrectePair.test(Mathieu));
        System.out.println(tailleIncorectePair.test(Balaji));
        System.out.println(poidsTropLourdPair.test(Rigo));

*/

    }
}
