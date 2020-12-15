package com.alanbirch.circle;

public class Circle {

    private static String color = "green";
    private double r;

    public Circle(double a) {
        this.r = a;
    }

    public Circle() {
        this.r = 5;
    }

    public double Circuit(){
        double o = 2 * Math.PI * r;
        System.out.println("The circuit is: " + o);
        return o;
    }

    public double Area(){
        double s = Math.PI * Math.sqrt(r);
        System.out.println("Area of circle is: " + s);
        return s;
    }

    public void Information(){
        System.out.println("Information about circle: \nColor: " + color + "\nRadius: " + r);
        Circuit();
        Area();
    }

    public double arcLenght(int alpha){
        alpha = 75;
        double a = (2 * Math.PI * r / 360) * alpha;
        return a;
    }
}
