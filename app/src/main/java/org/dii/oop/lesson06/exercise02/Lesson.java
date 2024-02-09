
package org.dii.oop.lesson06.exercise02;
import java.util.Scanner;

public class Lesson {
    public static void run() {
        CustomArrayList list = new CustomArrayList();

        Scanner in = new Scanner(System.in);

        do {
            //print menu as instructed in MD file
            System.out.println();
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Display all shape");
            System.out.println("5. Show summation of area");
            System.out.println("6. exit");
            System.out.print("Please select [1-6]:");

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
                list.listAllShapes();
                //print data as instructed
                //check how to iterate through arrayList

                //HINT3: you can use getClass() function of arrayList to get the name of class. It might be useful : )
            }
            if ("5".equals(choice)) {
                list.sumArea();
            }
            if ("6".equals(choice)) {
                break;
            }

        } while(true);

        in.close();
    }
}
