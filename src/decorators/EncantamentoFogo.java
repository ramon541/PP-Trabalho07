package decorators;

import interfaces.Item;

// Decorator concreto
public class EncantamentoFogo extends EncantamentoDecorator {
    public EncantamentoFogo(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", com Encantamento de Fogo";
    }

    @Override
    public int getAttack() {
        return super.getAttack() + 5;
    }
}
