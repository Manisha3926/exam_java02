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
public class Building {

    public void buildingRooms() {
        System.out.println("Building contains various rooms");
    }

}

class washRoom extends Building {

    public void buildingRooms() {
        System.out.println("There are multiple washrooms in every floor of the building");
    }
}

class bedRoom extends Building {

    public void buildingRooms() {
        System.out.println("There are bedrooms on every alternate floor of the building");
    }
}

class Main {

    public static void main(String[] args) {
        System.out.println("Answer for question 4: Manisha Mandapati");
        Building BuildingObj = new Building();
        Building washRoomObj = new washRoom();
        Building bedRoomObj = new bedRoom();

        BuildingObj.buildingRooms();
        washRoomObj.buildingRooms();
        bedRoomObj.buildingRooms();
    }
}
