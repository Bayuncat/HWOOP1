package org.example.personage;

import org.example.Activity;
import org.example.Comunication;
import org.example.Protection;
import org.example.Weapon;

// Арбалетчик
public class Crossbowman extends Hero implements Activity, Comunication {

// Военный опыт и модель арбалета
    private int warExperience;
    private String crossbowModel;

    public Crossbowman(String name, int damagePower, int health, int shieldPower, Protection protection, Weapon weapon, int warExperience, String crossbowModel) {
        super(name, damagePower, health, shieldPower, protection, weapon);
        this.warExperience = warExperience;
        this.crossbowModel = crossbowModel;
    }

    public int getWarExperience() {
        return warExperience;
    }

    public void setWarExperience(int warExperience) {
        this.warExperience = warExperience;
    }

    public String getCrossbowModel() {
        return crossbowModel;
    }

    public void setCrossbowModel(String crossbowModel) {
        this.crossbowModel = crossbowModel;
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
        System.out.println("Hello, I'm Crossbowman");
    }

    @Override
    public void sayBay() {
        System.out.println("Have a nice day my friend!");
    }
}
