package COMMAND;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Comando ligar = new LigarLampada(lampada);
        Botao botao = new Botao(ligar);

        botao.pressionar(); 
    }
}