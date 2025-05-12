package TEMPLATE_METHOD;

public class Main {
  public static void main(String[] args) {
    BebidaQuente cafe = new Cafe();
    cafe.prepararBebida();

    System.out.println();

    BebidaQuente cha = new Cha();
    cha.prepararBebida();

    System.out.println();

    BebidaQuente chocolate = new ChocolateQuente();
    chocolate.prepararBebida();
  }
}