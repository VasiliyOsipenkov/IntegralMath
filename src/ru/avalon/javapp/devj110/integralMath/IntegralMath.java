package ru.avalon.javapp.devj110.integralMath;

public class IntegralMath {

    public static void one () {
        double a = 2;
        double b = 5;
        double n = 100;

        double s = 0;
        double d = (b - a)/n;
        double xb = a;

        for(int i = 0; i < n; i++){
            double xe = xb + d;
            double xm = (xb + xe)/2;
            s = s + d * Math.log(xm);
            xb = xe;
        }
        System.out.println(" Интеграл 1  = " + s);
    }

    public static void two () {
        double a = 3;
        double b = 4;
        double n = 100;

        double s = 0;
        double d = (b - a)/n;
        double xb = a;

        for(int i = 0; i < n; i++){
            double xe = xb + d;
            double xm = (xb + xe)/2;
            s = s + d * ((xm * xm) + xm);
            xb = xe;
        }
        System.out.println(" Интеграл 2  = " + s);
    }

    public static void three () {
        double a = 0.01;
        double b = 2;
        double n = 100;

        double s = 0;
        double d = (b - a)/n;
        double xb = a;

        for(int i = 0; i < n; i++){
            double xe = xb + d;
            double xm = (xb + xe)/2;
            s = s + d * Math.exp(- xm);
            xb = xe;
        }
        System.out.println(" Интеграл 3  = " + s);
    }

    public static void four () {
        double a = 1;
        double b = 3;
        double n = 100;

        double s = 0;
        double d = (b - a)/n;
        double xb = a;

        for(int i = 0; i < n; i++){
            double xe = xb + d;
            double xm = (xb + xe)/2;
            s = s + d * Math.pow(xm, 2);
            xb = xe;
        }
        System.out.println(" Интеграл 4  = " + s);
    }

    public static void five () {
        double a = 0;
        double b = 1;
        double n = 100;

        double s = 0;
        double d = (b - a)/n;
        double xb = a;

        for(int i = 0; i < n; i++){
            double xe = xb + d;
            double xm = (xb + xe)/2;
            s = s + d * xm * Math.sin(xm);
            xb = xe;
        }
        System.out.println(" Интеграл 5  = " + s);
    }

    public static void main(String[] args) {

    }
    public static Double five () {
        double a = 0;
        double b = 1;
        double n = 100;

        double s = 0;
        double d = (b - a)/n;
        double xb = a;

        for(int i = 0; i < n; i++){
            double xe = xb + d;
            double xm = (xb + xe)/2;
            s = s + d * xm * Math.sin(xm);
            xb = xe;
        }
        return s;
    }

    private static class CalculatePrp implements CalculationOptions{

        @Override
        public Double m(double a, double b, double n) {
            double s = 0;
            double d = (b - a)/n;
            double xb = a;

            for(int i = 0; i < n; i++){
                double xe = xb + d;
                double xm = (xb + xe)/2;
                s = s + d * fun;
                xb = xe;
            }
            return s;
        }
    }
}
