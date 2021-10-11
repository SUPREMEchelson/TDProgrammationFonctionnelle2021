package Td.TD1.Pair;

public interface InterfacePair<A,B> {
     A getfsd();
     B getsnd();
     <C> InterfacePair<C,B> changeFst(C value);
     <C> InterfacePair<A,C> changeSnd(C value);

}
