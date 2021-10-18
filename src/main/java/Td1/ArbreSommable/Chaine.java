package Td1.ArbreSommable;

public class Chaine implements Sommable<Chaine>,Comparable<Chaine> {
private String val;

public Chaine(String valeur){
    this.val=valeur;
}

public String getval(){
    return val;
}

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

      @Override
        public Chaine sommer(final Chaine autre) {
            return new Chaine(String.format("%s%s", this.getval(), autre.getval()));
        }


    @Override
    public int compareTo(Chaine o) {
        return 0;
    }
}
