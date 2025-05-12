package FACTORY_METHOD;

public class BikeFactory extends TransportFactory {

  @Override
  public Transport createTransport() {
      return new Bike();
  }
}