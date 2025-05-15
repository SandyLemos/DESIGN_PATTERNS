package BRIDGE;

  //implementação do envio de mensagem por e-mail
public class Email implements Canal {
    public void enviar(String texto) {
        System.out.println("📧 Enviando por E-MAIL: " + texto);
    }
}