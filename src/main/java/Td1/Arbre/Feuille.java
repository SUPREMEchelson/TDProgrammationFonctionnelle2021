package Td1.Arbre;
import java.util.List;
import java.util.Set;

public class Feuille implements Arbre {
    private final int valeur;

    public Feuille(int val){
        this.valeur = val;
    }

    @Override
    public  int taille() {
    return 1;
    }

    @Override
    public boolean contient(Integer val) {
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
