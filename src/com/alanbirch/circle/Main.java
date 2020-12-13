package com.alanbirch.circle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input radius of circle: ");
        String input = sc.nextLine();

        Circle circle;
        try {
            double radius = Double.parseDouble(input);
            circle = new Circle(radius);
        } catch (NumberFormatException e) {
            circle = new Circle();
        }

        circle.Information();
    }
}