package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        test shape
	Shape shape = new Shape();
        System.out.println(shape);

//        test triangle
        System.out.println("Nhập 3 cạnh tam giác mới");
        System.out.println("a= ");
        double a = input.nextDouble();
        System.out.println("b= ");
        double b = input.nextDouble();
        System.out.println("c= ");
        double c = input.nextDouble();
        if ((a+b >c) || (a+c>b) || (b+c>a)){
            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Tam giác abc: "+triangle);
        }
        else System.out.println("Không phải 3 cạnh tam giác");
    }
}
