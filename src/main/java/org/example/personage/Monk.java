package org.example.personage;

import org.example.Activity;
import org.example.Comunication;
import org.example.Protection;
import org.example.Weapon;

// Монах
public class Monk extends Hero implements Activity, Comunication {

// Стаж работы и название харама
    private int workExperience;
    private String churchName;

    public Monk(String name, int damagePower, int health, int shieldPower, Protection protection, Weapon weapon, int workExperience, String churchName) {
        super(name, damagePower, health, shieldPower, protection, weapon);
        this.workExperience = workExperience;
        this.churchName = churchName;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getChurchName() {
        return churchName;
    }

    public void setChurchName(String churchName) {
        this.churchName = churchName;
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
        System.out.println("Hello, I'm Monk. My name is " + getName() + ".");
    }

    @Override
    public void sayBay() {
        System.out.println("God bless you!");
    }
}
