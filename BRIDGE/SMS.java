package BRIDGE;

public class SMS implements Canal {
    public void enviar(String texto) {
        System.out.println("📱 Enviando por SMS: " + texto);
    }
}