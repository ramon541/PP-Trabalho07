import classes.Armadura;
import classes.Espada;
import decorators.EncantamentoFogo;
import decorators.EncantamentoGelo;
import decorators.EncantamentoVeneno;
import interfaces.Item;

public class Main {
    public static void main(String[] args) {
        // Criando uma espada
        Item espada = new Espada();
        System.out.println(espada.getDescription() + " - Ataque: " + espada.getAttack() + ", Defesa: " + espada.getDefense());

        // Adicionando encantamento de fogo
        Item espadaComFogo = new EncantamentoFogo(espada);
        System.out.println(espadaComFogo.getDescription() + " - Ataque: " + espadaComFogo.getAttack() + ", Defesa: " + espadaComFogo.getDefense());

        // Adicionando encantamento de veneno sobre fogo
        Item espadaComFogoEVeneno = new EncantamentoVeneno(espadaComFogo);
        System.out.println(espadaComFogoEVeneno.getDescription() + " - Ataque: " + espadaComFogoEVeneno.getAttack() + ", Defesa: " + espadaComFogoEVeneno.getDefense());

        // Criando uma armadura
        Item armadura = new Armadura();
        System.out.println(armadura.getDescription() + " - Ataque: " + armadura.getAttack() + ", Defesa: " + armadura.getDefense());

        // Adicionando encantamento de gelo
        Item armaduraComGelo = new EncantamentoGelo(armadura);
        System.out.println(armaduraComGelo.getDescription() + " - Ataque: " + armaduraComGelo.getAttack() + ", Defesa: " + armaduraComGelo.getDefense());

        // Adicionando encantamento de fogo sobre gelo
        Item armaduraComGeloEFogo = new EncantamentoFogo(armaduraComGelo);
        System.out.println(armaduraComGeloEFogo.getDescription() + " - Ataque: " + armaduraComGeloEFogo.getAttack() + ", Defesa: " + armaduraComGeloEFogo.getDefense());
    }
}