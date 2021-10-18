package Td1.ArbreGenerique;

import java.util.Set;

public class Feuille implements Arbre<T> {
    private final int valeur;

    public Feuille(int val){
        this.valeur = val;
    }

    @Override
    public  int taille() {
    return 1;
    }

    @Override
    public boolean contient(T val) {
        return val.equals(valeur);

    }

    @Override
    public Set<Integer> valeurs() {
        return Set.of(valeur);
    }

    @Override
    public Integer somme() {
        return valeur;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return valeur;
    }

    @Override
    public boolean estTrie() {
        return true;
    }
}
