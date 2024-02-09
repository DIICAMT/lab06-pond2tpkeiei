package org.dii.oop.lesson06.exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson {
    public static void run() {
        ArrayList<Shape> list = new ArrayList<>();
        //HINT1: usage arraylist with Shape class to store all of your shapes, check how to use arrayList by yourself

        //HINT2: you may want to declare your arrayList around here

        Scanner in = new Scanner(System.in);

        do {
            //print menu as instructed in MD file
            System.out.println();
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Display all shape");
            System.out.println("5. exit");
            System.out.print("Please select [1-5]:");

            String choice = in.next();

            // TODO: write your code here

            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                double strRadius = in.nextDouble();
                list.add(new Circle(strRadius));
            }
            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                double strWidth = in.nextDouble();
                System.out.print("Enter height: ");
                double strHeight = in.nextDouble();
                list.add(new Rectangle("Rectangle",strWidth, strHeight));

                //store to arrayList
            }
            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                double strSide = in.nextDouble();
                list.add(new Square("Square",strSide));

                //store to arrayList
            }
            if ("4".equals(choice)) {
                System.out.println("List all shape: ");

                for (Shape shape : list) {
                    System.out.print("Name: " + shape.getName() + "");
                    System.out.print("Number of side: " + shape.getNumSides() + "");
                    System.out.print("Area: " + shape.getArea() + "");
                    System.out.print("Perimeter: " + shape.getPerimeter() + "");
                    System.out.println();
                }
                //print data as instructed
                //check how to iterate through arrayList

                //HINT3: you can use getClass() function of arrayList to get the name of class. It might be useful : )
            }
            if ("5".equals(choice)) {
                break;
            }

        } while(true);

        in.close();
    }
}