package org.example.personage;

import org.example.Protection;
import org.example.Weapon;

abstract class Hero {
    private String name;
    private int damagePower;
    private int health;
    private int shieldPower;
    private Protection protection;
    private Weapon weapon;

    public Hero(String name, int damagePower, int health, int shieldPower, Protection protection, Weapon weapon) {
        this.name = name;
        this.damagePower = damagePower;
        this.health = health;
        this.shieldPower = shieldPower;
        this.protection = protection;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamagePower() {
        return damagePower;
    }

    public void setDamagePower(int damagePower) {
        this.damagePower = damagePower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getShieldPower() {
        return shieldPower;
    }

    public void setShieldPower(int shieldPower) {
        this.shieldPower = shieldPower;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", damagePower=" + damagePower +
                ", health=" + health +
                ", shieldPower=" + shieldPower +
                '}';
    }
}
