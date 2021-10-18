package Td1.ArbreGenerique;


import java.util.List;

public class App {
    public static void main(String argv[]){
         final Arbre f1 = new Feuille(1);
            final Arbre f2 = new Feuille(2);
            final Arbre n1 = new Noeud(List.of(f1, f2));
            final Arbre f3 = new Feuille(3);
            final Arbre n2 = new Noeud(List.of(n1, f3));

            System.out.println(n2.taille());
            System.out.println(n2.contient(1));
            System.out.println(n2.contient(2));
            System.out.println(n2.contient(3));
            System.out.println(n2.contient(4));
            System.out.println(n2.valeurs());

            /*System.out.println(n2.somme());
            System.out.println(n2.min()); */}
    }

