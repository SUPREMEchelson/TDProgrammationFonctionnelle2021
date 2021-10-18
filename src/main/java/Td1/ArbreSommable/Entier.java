package Td1.ArbreSommable;

public class Entier implements Sommable<Entier>{
    private Integer valeur;

    public Entier(Integer valeur) {
        this.valeur = valeur;
    }

    public Integer valeur() {
        return valeur;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public Entier sommer(Entier other) {
        return new Entier(this.valeur() + other.valeur());
    }

  /*  @Override
        public int compareTo(Chaine autre) {
        return this.valeur.compareTo(autre.compareTo());
        }
*/
    }


