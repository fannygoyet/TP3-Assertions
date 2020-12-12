package model;

public class AssertionsDes {
    public int division(int a, int b) {
        assert b > 0 : "Impossible car b<=0";
        int res = 0;
        while(a >= b) {
            res ++;
            a -= b;
            a = a;
        }
        return res;}
}
