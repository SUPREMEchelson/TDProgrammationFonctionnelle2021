package Td1.Arbre;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeuilleTest {
    Feuille f1 = new Feuille(2);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void taille() {
        assertEquals(f1.taille(),1);
    }
}