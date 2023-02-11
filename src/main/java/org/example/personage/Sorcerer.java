package org.example.personage;

import org.example.Activity;
import org.example.Comunication;
import org.example.Protection;
import org.example.Weapon;

// Колдун
public class Sorcerer extends Hero implements Activity, Comunication {


// Опыт колдавства и модель палочки

    private int magicExperience;
    private String stickModel;

    public Sorcerer(String name, int damagePower, int health, int shieldPower, Protection protection, Weapon weapon, int magicExperience, String stickModel) {
        super(name, damagePower, health, shieldPower, protection, weapon);
        this.magicExperience = magicExperience;
        this.stickModel = stickModel;
    }

    public int getMagicExperience() {
        return magicExperience;
    }

    public void setMagicExperience(int magicExperience) {
        this.magicExperience = magicExperience;
    }

    public String getStickModel() {
        return stickModel;
    }

    public void setStickModel(String stickModel) {
        this.stickModel = stickModel;
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
        System.out.println("Hello, I'm Sorcerer");
    }

    @Override
    public void sayBay() {
        System.out.println("I will turn you into a frog!");
    }
}
