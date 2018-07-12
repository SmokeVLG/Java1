package com.company;

public class Main {

    public static void main(String[] args) {
        byte a = -128;
        short b = -15000;
        int c = -3;
        long d = -5;
        float e = -6;
        double f = -7;
        boolean g = true;
        char h = 'a';
        float i = getResult(10, 11, 12, 13);
        boolean j = isOurNumber(15);
        getNumberType(-10);
        boolean k=isNegativeNumber(-10);
        outName("Maxim");
    }

    private static void outName(String str) {
        System.out.println("«Привет,"+str+"!»;");
    }

    private static boolean isNegativeNumber(int i) {
        return i<0;
    }

    private static void getNumberType(int i) {
        if(i>=0){
            System.out.println("Положительное число");
        }else{
            System.out.println("Отрицательно число");
        }
    }

    private static boolean isOurNumber(int i) {
        return i > 10 && i <= 20;
    }

    private static float getResult(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
}
