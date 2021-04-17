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
public class Person {

    private String name;
    private String address;
    private long phonenumber;
    private String emailAddress;

    public Person(String name, String address, long phonenumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Person from " + this.getClass().getName() + " class is " + name;
    }

}
