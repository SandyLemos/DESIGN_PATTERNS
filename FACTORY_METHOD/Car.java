package FACTORY_METHOD;

public class Car implements Transport {
  
  @Override
  public void deliver() {
    System.out.println("Entregando por carro");
  }
}
