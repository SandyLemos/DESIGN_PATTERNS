package ABSTRACT_FACTORY;

public class LojaRustica implements LojaFactory{
    @Override
    public Mesa criarMesa() {
        return new MesaRustica();
    }

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraRustica() {
        };
    }
}
