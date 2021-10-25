package Td2.Exercice1;

import java.util.List;

public class App {
    public static void main(String args[]){
        Somme<Integer> sommeInteger = ((x1, x2) -> {
            return x1+x2;
        }
        );
        Somme<Double> sommeDouble = ((x1, x2) -> {
            return x1+x2;
        }
        );
        Somme<Long> sommeLong = ((x1, x2) -> {
            return x1+x2;
        }
        );

        Integer resultatDeSomme = sommeInteger.somme(4,8);
        Double resultatDouble = sommeDouble.somme(3.0,4.0);
        Long resultatLong = sommeLong.somme(100L,100L);







//Question 1
        System.out.println(resultatDeSomme);
        System.out.println(resultatDouble);
        System.out.println(resultatLong);

        System.out.println("/*****************************************/");


        // question 2
/*
        ToString<S> convertList = ((x1)->{
            for(convertList : )
            return x1.toString(x1);
        }
        );

        String resultatDeConvertion = toString.convert(100);
        System.out.println(resultatDeConvertion);

 */

/* Predicate ->
Function
Consumer -> ne retourne rien,
Supplier


*/




/*
        ToString<S> convertList = ((x1)->{
            for(convertList : )
            return x1.toString(x1);
        }
        );

        String resultatDeConvertion = toString.convert(100);
        System.out.println(resultatDeConvertion);

        */

        // question 3



/* Predicate ->
Function : Convertie (map) un type vers un autre. Lambda avec une
variable
Stockage de lambda expression : signature (T)  R


Consumer : ne prend pas d'argument et ne retourne pas de valeur
Consume une entrée et ne retourne rien Stockage Lambda expression : signature (T)  void


Supplier :
Predicat - > permet de faire des conditions sur une valeur


*/
    }
}
