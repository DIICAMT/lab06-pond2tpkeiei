package org.dii.oop.lesson06.exercise02;
import java.util.*;
public class Shape {
    private String name;
    private int numsides;

    Shape(String name, int numsides) {
        this.name = name;
        this.numsides = numsides;
    }
    public String getName(){
        return name;
    }
    public int getNumSides() {
        return numsides;
    }
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        super("Circle",1);
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(String name,double width, double height) {
        super(name, 4); // Rectangle has 4 sides
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
class Square extends Rectangle {
    Square(String name,double side) {
        super(name,side,side);
    }
}
class CustomArrayList extends ArrayList<Shape> {
    public void listAllShapes() {
        for (Shape shape : this) {
            System.out.println("Name: " + shape.getName() + "Number of side" + shape.getNumSides() + "   Area: " + shape.getArea() + "   Perimeter: " + shape.getPerimeter());
        }
    }
    public void sumArea() {
        double sum = 0;
        for (Shape shape : this) {
            sum += shape.getArea();
        }
        System.out.println("Sum of areas: " + sum);
    }
}
