package org.example.personage;

import org.example.Activity;
import org.example.Comunication;
import org.example.Protection;
import org.example.Weapon;

// Копейщик
public class Spearman extends Hero implements Activity, Comunication {

// Военный опыт и модель копья

    private int warExperience;
    private String spearModel;

    public Spearman(String name, int damagePower, int health, int shieldPower, Protection protection, Weapon weapon, int warExperience, String spearModel) {
        super(name, damagePower, health, shieldPower, protection, weapon);
        this.warExperience = warExperience;
        this.spearModel = spearModel;
    }

    public int getWarExperience() {
        return warExperience;
    }

    public void setWarExperience(int warExperience) {
        this.warExperience = warExperience;
    }

    public String getSpearModel() {
        return spearModel;
    }

    public void setSpearModel(String spearModel) {
        this.spearModel = spearModel;
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
        System.out.println("Hello, I'm Spearman");
    }

    @Override
    public void sayBay() {
        System.out.println("Take care of yourself!");
    }
}
