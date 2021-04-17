/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer3;

/**
 *
 * @author Manisha Mandapati
 */
public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Returns a String in a specified format.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Circle{"
                + "radius = " + radius
                + '}';
    }
}
