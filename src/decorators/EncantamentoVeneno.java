package decorators;

import interfaces.Item;

// Decorator concreto
public class EncantamentoVeneno extends EncantamentoDecorator {
    public EncantamentoVeneno(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", com Encantamento de Veneno";
    }

    @Override
    public int getAttack() {
        return super.getAttack() + 3;
    }
}
