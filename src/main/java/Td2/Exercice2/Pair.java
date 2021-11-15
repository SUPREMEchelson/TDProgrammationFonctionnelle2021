package Td2.Exercice2;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Pair<T,U> {
    public T fst;
    public U snd;
    public List<Predicate<T>> listePredicat;


    public Pair(T fst, U snd) {
        this.fst = fst;
        this.snd = snd;
    }

    void addlistePredicat(List<Predicate<T>> listePredicat, Predicate<T> p1) {
        listePredicat.add(1, p1);
    }

    public Boolean filtragePredicatif(List<Predicate<T>> listePredicat) {
        for (Predicate<T> n : listePredicat) {
            if (n.test(fst) != true) {
                return false;
            }
        }
        return true;
    }
}

