package com.yk1;

public class Tets {
    public static void main(String[] args) {
        int[] x = new int[5];
        try {
            x[710] = 3/0;

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Максимум " +(x.length-1) + "......");
        } catch (ArithmeticException ex) {
            System.out.println(":( " + ex);
        }
    }
}
