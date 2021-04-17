/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer5;

import java.util.Date;

/**
 *
 * @author Manisha Mandapati
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 5: Manisha Mandapati");
        Date d = new Date();
        Person per = new Person("Manisha", "Maryville",
                660528123, "manishamandapati@gmail.com");
        Student stu = new Student(8.8, "Padmini", "Maryville",
                660528987, "padmini@gmail.com");
        Employee em1 = new Employee("Northwest", 8000, d, "Aneela",
                "Maryville", 123456, "Aneela@gmail.com");
        Staff s1 = new Staff("Assistant", "gym", 7000, d,
                "Adithya", "Maryville", 949165373, "adithya@gmail.com");
        Faculty f1 = new Faculty(20, 4, "Colden Hall", 100000, d,
                "Ajay Bandi", "Northwest", 787878787, "ajaybandi@gmail.com");

        System.out.println(per);
        System.out.println(stu);
        System.out.println(em1);
        System.out.println(s1);
        System.out.println(f1);
    }

}
