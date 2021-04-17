/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Manisha Mandapati
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Object> array = new ArrayList<>();
        System.out.println("Answer for question 3: Manisha Mandapati");

        Loan loanObject = new Loan("Education loan", 156, 9.8);
        Circle circleObject = new Circle(4.5);
        String stringObj = "Manisha";
        Date dateObj = new Date();

        array.add(loanObject);
        array.add(circleObject);
        array.add(stringObj);
        array.add(dateObj);

        for (Object m : array) {
            System.out.println(m);
        }
    }

}
