package PROTOTYPE;

public class Enemy implements EnemyPrototype {
  private String tipo;
  private int vida;
  private int ataque;
  private int defesa;
  private String arma;

  public Enemy(String tipo, int vida, int ataque, int defesa, String arma) {
    this.tipo = tipo;
    this.vida = vida;
    this.ataque = ataque;
    this.defesa = defesa;
    this.arma = arma;
  }

  @Override
  public void atacar() {
    System.out.println(tipo + " ataca com " + arma + " causando " + ataque + " de dano. ");
  }

  @Override
  public void exibirInfo() {
    System.out.println("Tipo: " + tipo + ", Vida: " + vida + ", Ataque: " + ataque + ", Defesa: " + defesa + ", Arma: " + arma);
  }

  @Override 
  public EnemyPrototype clone() {
    return new Enemy(tipo, vida, ataque, defesa, arma);
  }
}