/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer4;

/**
 *
 * @author Manisha Mandapati
 */
public class University {

    public void rooms() {
        System.out.println("University contains various rooms");
    }

}

class StaffRoom extends University {

    public void rooms() {
        System.out.println("Every university have staffrooms for faculty");
    }
}

class Library extends University {

    public void rooms() {
        System.out.println("Students study in the library");
    }
}

class Main {

    public static void main(String[] args) {
        System.out.println("Answer for Question 4: Manisha Mandapati");
        University u = new University();
        University s = new StaffRoom();
        University L = new Library();

        u.rooms();
        s.rooms();
        L.rooms();
    }
}
