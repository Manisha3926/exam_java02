/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer8;

/**
 *
 * @author Manisha Mandapati
 */
public class Car extends Vehicle {

    public Car() {

    }

    public String name() {
        return "Car is a vehicle";
    }

    public static void main(String[] args) {
        System.out.println("Answer for question 8: Manisha Mandapati");
        Vehicle v = new Car();
        System.out.println("there are multiple models in cars" + "\n" + v.name());
    }

}
