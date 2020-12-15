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
        return o;
    }

    public double Area(){
        double s = Math.PI * Math.sqrt(r);
        return s;
    }

    public void Information(){
        System.out.println("Information about circle: \nColor: " + color +
                           "\nRadius: " + r +
                           "\nThe circuit is: " + Circuit() +
                           "\nArea of circle is: " + Area());
    }

    public double arcLenght(int alpha){
        alpha = 75;
        double a = (2 * Math.PI * r / 360) * alpha;
        return a;
    }
}
