package BRIDGE;

public class Main {
    public static void main (String[] args) {
    Mensagem mensagemSMS = new Mensagem(new SMS());
    mensagemSMS.enviarMensagem("Mensagem de alerta: Verifique seu sistema.");

    System.out.println("---");

    Mensagem mensagemEmail = new Mensagem(new Email());
    mensagemEmail.enviarMensagem("Mensagem comum: Bem-vindo à nossa plataforma!");
    }
}