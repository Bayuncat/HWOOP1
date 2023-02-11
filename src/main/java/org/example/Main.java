package org.example;

import org.example.personage.*;

public class Main {
    public static void main(String[] args) {

        Crossbowman crb1 = new Crossbowman("Shurick", 5, 25, 15, Protection.Shield,
                Weapon.Ñrossbow, 10, "Strela");

        Peasant psnt1 = new Peasant("Sergik", 2, 25,5, Protection.Cross, Weapon.Pitchfork,
                100, "Filippovskoe");

        Monk mnk1 = new Monk("Vldik", 5, 20,5, Protection.Cross, Weapon.Suggestion,
                10, "OrtodoxChurch");

        crb1.sayHello();
        psnt1.sayHello();
        mnk1.sayHello();
        System.out.println("");
        crb1.sayBay();
        psnt1.sayBay();
        mnk1.sayBay();

    }
}