package classes;

import interfaces.Item;

// Classe concreta
public class Armadura implements Item {
    @Override
    public String getDescription() {
        return "Armadura";
    }

    @Override
    public int getAttack() {
        return 0;
    }

    @Override
    public int getDefense() {
        return 15;
    }
}