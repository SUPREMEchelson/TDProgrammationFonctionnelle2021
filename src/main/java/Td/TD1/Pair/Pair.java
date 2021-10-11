package Td.TD1.Pair;

public class Pair<A,B> {
    private A fst;
    private B snd;

    public Pair(A fst, B snd){
    this.fst=fst;
    this.snd=snd;
    }

    public A fst (A fst) {
        return fst;
    }

    public B snd (B snd) {
        return snd;
    }
    void changeFst (Pair<A,B> p1, A change){
        p1.fst=change;
    }
    void changeSnd (Pair<A,B> p1, B change){
        p1.snd=change;
    }
    @Override
    public String toString() {
        return "Pair{" +
                "fst=" + fst +
                ", snd=" + snd +
                '}';
    }
}
