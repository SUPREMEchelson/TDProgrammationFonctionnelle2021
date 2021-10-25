package Td2.Exercice2;

import java.util.function.Predicate;

public class App {
    public static void main(String arg[]){


        Pair<Integer,Double> Mathieu = new Pair<>(70,170.0);

        Predicate<Pair> tropPetit = x -> x.fst<100;
        Predicate<Pair> tropGrand = x ->x.snd>200.0;

        System.out.println(tropPetit.test(Mathieu));




    }
}
