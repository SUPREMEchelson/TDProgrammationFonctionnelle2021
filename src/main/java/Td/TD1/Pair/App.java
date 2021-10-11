package Td.TD1.Pair;

public class App {
    public static void main(String argv[]){
        Pair<Integer,String> p1 = new Pair<>(1,"un");
        System.out.println(p1.toString());

        p1.changeFst(p1,5);
         System.out.println(p1.toString());
         p1.changeSnd(p1,"chelson");
        System.out.println(p1.toString());

}
}
