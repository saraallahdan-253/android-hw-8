package com.example.cw7;

import java.io.Serializable;

public class bokemon implements Serializable {
    public String name;
    public int image;
    public int attack;
    public int defence;
    public int total;

    public bokemon(String name, int image, int attack, int defence, int total) {
        this.name = name;
        this.image = image;
        this.attack = attack;
        this.defence = defence;
        this.total = total;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
