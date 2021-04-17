/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer2;

import java.util.Scanner;

/**
 *
 * @author Manisha Mandapati
 */
public class TwoDimensions {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s9 = new Scanner(System.in);
        System.out.println("Answer for question 2: Manisha Mandapati");
        int[][] M = new int[3][3];
        int[][] M1 = new int[3][3];
        int i, j;

        System.out.print("Enter list1: ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                M[i][j] = s9.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                M1[i][j] = s9.nextInt();
            }
        }

        if (equals(M, M1)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static boolean equals(int[][] M, int[][] M1) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (M[i][j] != M1[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }
}
