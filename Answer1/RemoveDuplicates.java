/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer1;

import java.util.*;

/**
 *
 * @author Manisha Mandapati
 */
public class RemoveDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner m = new Scanner(System.in);
        System.out.println("Answer for question 1: Manisha Mandapati");

        ArrayList<Integer> removeset = new ArrayList<Integer>();
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            removeset.add(m.nextInt());
        }

        removeDuplicate(removeset);

        System.out.print("The distinct integers are ");
        for (int i = 0; i < removeset.size(); i++) {
            System.out.print(removeset.get(i) + " ");
        }
        System.out.println();
    }

    public static void removeDuplicate(ArrayList<Integer> removeset) {
        for (int i = 0; i < removeset.size() - 1; i++) {
            for (int j = i + 1; j < removeset.size(); j++) {
                if (removeset.get(i) == removeset.get(j)) {
                    removeset.remove(j);
                }
            }
        }
    }
}
