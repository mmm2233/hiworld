package org.example;

public class LIanxi {
    public  static  int di(int x){
        if (x==1) return 4;
        if (x==0) return 0;
        return  2*di(x-1)+di(x-2);

    }

    public static void main(String[] args) {

        String x ="111";
        System.out.println(x);
        x ="2222";
        System.out.println(x);
    }
}
