package COMMAND;

public class LigarLampada implements Comando {
    private Lampada lampada;

    public LigarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        lampada.ligar();
    }
}

