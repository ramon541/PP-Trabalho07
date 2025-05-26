package decorators;

import interfaces.Item;

// Decorator base
public class EncantamentoDecorator implements Item {
    protected Item item;

    public EncantamentoDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public int getAttack() {
        return item.getAttack();
    }

    @Override
    public int getDefense() {
        return item.getDefense();
    }
}
