package TEMPLATE_METHOD;

abstract class BebidaQuente {
    public final void prepararBebida() {
      ferverAgua();
      preparar();
      servirNaXicara();
    }

    public void ferverAgua() {
      System.out.println("Fervendo a água");
    }

    public void servirNaXicara() {
      System.out.println("Servindo na xícara");
    }

    public abstract void preparar();
}
