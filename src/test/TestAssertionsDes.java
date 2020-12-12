package test;

import model.AssertionsDes;

public class TestAssertionsDes {

    public static void main(String[] args){
        test1();
        test2();
        test3();
    }


    // Q1 : rend 10
    private static void test1(){
        AssertionsDes ass1 = new AssertionsDes();
        int oui = ass1.division(10,1);
        System.out.println(oui);
    }

    // Q1 : rend 4
    private static void test2(){
        AssertionsDes ass1 = new AssertionsDes();
        int oui = ass1.division(8,2);
        System.out.println(oui);
    }

    // Q1 : Le While ne tourne en boucle, ne rend pas de résultat
    private static void test3(){
        AssertionsDes ass1 = new AssertionsDes();
        int oui = ass1.division(6,0);
        System.out.println(oui);
    }
}
