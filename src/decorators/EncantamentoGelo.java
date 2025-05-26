package decorators;

import interfaces.Item;

// Decorator concreto
public class EncantamentoGelo extends EncantamentoDecorator {
    public EncantamentoGelo(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", com Encantamento de Gelo";
    }

    @Override
    public int getDefense() {
        return super.getDefense() + 5;
    }
}