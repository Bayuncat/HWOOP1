package org.example.personage;

import org.example.Activity;
import org.example.Comunication;
import org.example.Protection;
import org.example.Weapon;

// Разбойник
public class Robber extends Hero implements Activity, Comunication {


    // Количетсво жен и денег
    private int wifeVolue;
    private int money;

    public Robber(String name, int damagePower, int health, int shieldPower, Protection protection, Weapon weapon, int wifeVolue, int money) {
        super(name, damagePower, health, shieldPower, protection, weapon);
        this.wifeVolue = wifeVolue;
        this.money = money;
    }

    public int getWifeVolue() {
        return wifeVolue;
    }

    public void setWifeVolue(int wifeVolue) {
        this.wifeVolue = wifeVolue;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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
        System.out.println("Hello, I'm Robber");
    }

    @Override
    public void sayBay() {
        System.out.println("Hey! Check your pocket!");
    }
}
