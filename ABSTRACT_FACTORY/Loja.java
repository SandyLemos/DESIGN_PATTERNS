package ABSTRACT_FACTORY;

public class Loja {
    public static void main(String[] args) {
        LojaFactory factory = new LojaModerna();
        LojaFactory factory1 = new LojaRustica();
        LojaFactory factory2 = new LojaTradicional();

        Mesa mesa = factory.criarMesa();
        Mesa mesa1 = factory1.criarMesa();
        Cadeira cadeira = factory2.criarCadeira();

        mesa.montar();
        mesa1.montar();
        cadeira.montar();

    }
}
