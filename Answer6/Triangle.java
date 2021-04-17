/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer6;

/**
 *
 * @author Manisha Mandapati
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;
    private boolean isFilled;
    private String color;

    public Triangle(double side1, double side2, double side3,
            boolean isFilled, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.isFilled = isFilled;
        this.color = color;
    }

    @Override
    double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    double area() {
        double d = this.perimeter() / 2;
        return Math.sqrt(Math.abs(d * (d - side1)
                * (d - side2) * (d - side3)));
    }

    @Override
    public String toString() {
        return "Triangle properties: \nArea is "
                + Math.round(this.area() * 100) / 100.0
                + "\nPerimeter is " + this.perimeter()
                + "\nThe Triangle is "
                + (isFilled ? "Filled" : "Not Filled ")
                + "\nTriangle Color is " + color;
    }

}
