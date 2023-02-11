package org.example.personage;

import org.example.Activity;
import org.example.Comunication;
import org.example.Protection;
import org.example.Weapon;

// Крестьянин
public class Peasant extends Hero implements Activity, Comunication {

    // Количетсво коров и название деревни
    private int cowsVolue;
    private String villageName;

    public Peasant(String name, int damagePower, int health, int shieldPower, Protection protection, Weapon weapon, int cowsVolue, String villageName) {
        super(name, damagePower, health, shieldPower, protection, weapon);
        this.cowsVolue = cowsVolue;
        this.villageName = villageName;
    }

    public int getCowsVolue() {
        return cowsVolue;
    }

    public void setCowsVolue(int cowsVolue) {
        this.cowsVolue = cowsVolue;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    @Override
    public void Move() {

    }

    @Override
    public void Attack() {

    }

    @Override
    public void Defend() {

    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm just a peasent. My name is " + getName() + ".");
    }

    @Override
    public void sayBay() {
        System.out.println("Have a nice day, Mister!");
    }
}
