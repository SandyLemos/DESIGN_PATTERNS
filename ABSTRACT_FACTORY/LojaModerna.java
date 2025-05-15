package ABSTRACT_FACTORY;

public class LojaModerna implements LojaFactory {
    @Override
    public Mesa criarMesa() {
        return new MesaModerna();
    }

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }
}
