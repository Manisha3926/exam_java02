/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer7;

/**
 *
 * @author Manisha Mandapati
 */
public enum Jewellery {
    Bracelet(100), Ring(80), Earrings(150);

    private int price;

    private Jewellery(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class enum1 {

    public static void main(String[] args) {
        System.out.println("Answer for question 7: Manisha Mandapati");
        Jewellery j;
        System.out.println("price of Bracelet is " + Jewellery.Bracelet.getPrice() + "$ per eachitem");
        System.out.println("price of the jewellery");

        for (Jewellery j1 : Jewellery.values()) {
            System.out.println(j1 + "price is " + j1.getPrice() + "$ per eachitem.");
        }

    }
}
