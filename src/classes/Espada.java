package classes;

import interfaces.Item;

// Classe concreta
public class Espada implements Item {
    @Override
    public String getDescription() {
        return "Espada";
    }

    @Override
    public int getAttack() {
        return 10;
    }

    @Override
    public int getDefense() {
        return 0;
    }
}