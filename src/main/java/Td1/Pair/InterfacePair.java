package Td1.Pair;

public interface InterfacePair<A,B> {
     A fsd();
     B snd();
     <C> InterfacePair<C,B> changeFst(C value);
     <C> InterfacePair<A,C> changeSnd(C value);
}
