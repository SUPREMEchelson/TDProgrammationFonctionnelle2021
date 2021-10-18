package Td1.Pair;

public class Pair<A,B> implements InterfacePair<A,B>{
    private A fst;
    private B snd;

    public Pair(A fst, B snd){
    this.fst=fst;
    this.snd=snd;
    }
    @Override
    public String toString() {
        return "Pair{" +
                "fst=" + fst.toString() +
                ", snd=" + snd +
                '}';
    }

    @Override
    public A fsd() {
        return fst;
    }

    @Override
    public B snd() {
        return snd;
    }

    public <C> InterfacePair<A,C> changeSnd(C val) {
        return new Pair<>(fst,val);
    }

    @Override
    public <C>InterfacePair<C,B> changeFst(C val) {
        return new Pair<>(val,snd);
    }
}
