package COMMAND;

public class Botao {
  private Comando comando;

  public Botao(Comando comando) {
    this.comando = comando;
  }

  public void pressionar() {
    comando.executar();
  }
}