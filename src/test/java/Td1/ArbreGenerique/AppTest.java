package Td1.ArbreGenerique;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    public static final Arbre arbre1(){
        final Arbre <Integer> f1 =new Feuille(1);
        final Arbre <Integer> f2 =new Feuille(2);
        final Arbre <Integer> n1 = new Noeud(List.of(f1,f2));
        final Arbre <Integer> f3 = new Feuille(3);
        final Arbre<Integer> n2 = new Noeud(List.of(n1,f3));
        return n2;
    }


    @Test
    public void testSize(){
        assertEquals(3,arbre1().taille());
        assertTrue(arbre1().contient(7)); // false
        assertTrue(arbre1().contient(2)); // true



    }
}
