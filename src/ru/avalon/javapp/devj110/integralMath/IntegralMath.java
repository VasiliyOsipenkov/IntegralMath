package ru.avalon.javapp.devj110.integralMath;

public class IntegralMath {

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
        CalculationOptions one = new CalculateOne();
        System.out.println("Первый интеграл: " + one.m(100));// Первое задание: вложенный класс

        CalculationOptions two = new CalculationOptions() {
            @Override
            public Double m(double n) {
                double a = 3;
                double b = 4;
                double s = 0;
                double d = (b - a)/n;
                double xb = a;

                for(int i = 0; i < n; i++){
                    double xe = xb + d;
                    double xm = (xb + xe)/2;
                    s = s + d * ((xm * xm) + xm);
                    xb = xe;
                }
                return s;
            }
        };
        System.out.println("Второй интеграл: " + two.m(100));// Второе задание: анонимный класс

        System.out.println("Третий интеграл: " + new CalculateThree().m(100));// Третье задание: ссылка на статический метод (внутри класса CalculateThree)

        CalculateFour f = new CalculateFour();
        CalculationOptions four = f::c;// ссылка на экземпляр класса
        System.out.println("Четвертый интеграл: " + four.m(100));// Четвертое задание: ссылка на экземпляр класса

        CalculationOptions five = n -> {// лямбда выражение (блоком)
            double a = 0;
            double b = 1;

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
        };
        System.out.println("Пятый интеграл: " + five.m(100));// Пятое задание: лямбда-выражение
    }

    private static class CalculateOne implements CalculationOptions {

        @Override
        public Double m(double n) {
            double a = 2;
            double b = 5;
            double s = 0;
            double d = (b - a)/n;
            double xb = a;

            for(int i = 0; i < n; i++){
                double xe = xb + d;
                double xm = (xb + xe)/2;
                s = s + d * Math.log(xm);
                xb = xe;
            }
            return s;
        }
    }
    private static class CalculateThree implements CalculationOptions {
        CalculationOptions three = Math::exp;// ссылка на статический класс
        @Override
        public Double m(double n) {
            double a = 0.01;
            double b = 2;

            double s = 0;
            double d = (b - a)/n;
            double xb = a;

            for(int i = 0; i < n; i++){
                double xe = xb + d;
                double xm = (xb + xe)/2;
                s = s + d * three.m(- xm);
                xb = xe;
            }
            return s;
        }
    }
    private static class CalculateFour {
        double c (double n) {
            double a = 1;
            double b = 3;

            double s = 0;
            double d = (b - a)/n;
            double xb = a;

            for(int i = 0; i < n; i++){
                double xe = xb + d;
                double xm = (xb + xe)/2;
                s = s + d * Math.pow(xm, 2);
                xb = xe;
            }
            return s;
        }
    }
}
