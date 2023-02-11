package org.example.personage;

import org.example.Activity;
import org.example.Comunication;
import org.example.Protection;
import org.example.Weapon;

// Снайпер
public class Sniper extends Hero implements Activity, Comunication {

    // Количетсво патронов и модель ружья
    private int cartridges;
    private String rifleModel;

    public Sniper(String name, int damagePower, int health, int shieldPower, Protection protection, Weapon weapon, int cartridges, String rifleModel) {
        super(name, damagePower, health, shieldPower, protection, weapon);
        this.cartridges = cartridges;
        this.rifleModel = rifleModel;
    }

    public int getCartridges() {
        return cartridges;
    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }

    public String getRifleModel() {
        return rifleModel;
    }

    public void setRifleModel(String rifleModel) {
        this.rifleModel = rifleModel;
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
        System.out.println("Hello, I'm Sniper");
    }

    @Override
    public void sayBay() {
        System.out.println("Buh-Buh");
    }
}
