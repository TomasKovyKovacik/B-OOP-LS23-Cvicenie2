package sk.stuba.fei.uim.oop;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int[] y = new int[]{1, 2, 3};

        System.out.println(x);
        testPrimitive(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        testPole(y);
        System.out.println(Arrays.toString(y));
    }

    public static void testPole(int[] y) {
        y[0] = 50;
        System.out.println(Arrays.toString(y));
    }

    public static void testPrimitive(int cislo) {
        cislo = 10;
        System.out.println(cislo);
    }
}
