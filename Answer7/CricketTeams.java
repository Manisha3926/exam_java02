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
public enum CricketTeams {
    CSK,RCB,MI;

}
class Teams{
    CricketTeams c;

    public Teams(CricketTeams c){
        this.c=c;
    }
    public void nameofCricketTeams(){
        switch(c){
            case CSK:
                System.out.println("Name of the Cricket team is: CSK");
                break;
            case RCB:
                System.out.println("Name of the Cricket team is: RCB");
                break;
            case MI:
                System.out.println("Name of the Cricket team is: MI");
                break;
            default:
                System.out.println("There are 8 ipl teams");

        }
    }
    public static void main(String[] args){
        System.out.println("Answer for question 7: Manisha Mandapati");
        Teams t = new Teams(CricketTeams.CSK);
        t.nameofCricketTeams();
        Teams t1 = new Teams(CricketTeams.RCB);
        t1.nameofCricketTeams();
        Teams t2 = new Teams(CricketTeams.MI);
        t2.nameofCricketTeams();
    }
}

