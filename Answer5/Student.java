/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer5;

/**
 *
 * @author Manisha Mandapati
 */
public class Student extends Person {

    private double grade;
    public static final String CLASS_STATUS = "Graduate";

    public Student(double grade, String name, String address,
            long phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Person name from " + this.getClass().getName() + " is "
                + super.getName();
    }

}
