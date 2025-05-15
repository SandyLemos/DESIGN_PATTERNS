package BUILDER;

public class Builder_Main {
    public static void main(String[] args) {
        //Implemente a chamada do Builder


        Personagem guerreiro = new GuerreiroBuilder()
            .comNome("Thorfin")
            .comVida(10)
            .comMana(30)
            .comForca(5)
            .comInteligencia(-30)
            .comAgilidade(300)
            .build();

        Personagem mago = new MagoBuilder()
            .comNome("Merlin")
            .comVida(20)
            .comMana(60)
            .comForca(15)
            .comInteligencia(30)
            .comAgilidade(30)
            .build();


        Personagem arqueiro = new ArqueiroBuilder()
            .comNome("Ashe")
            .comVida(50)
            .comMana(20)
            .comForca(20)
            .comInteligencia(40)
            .comAgilidade(30)
            .build();

        System.out.println("=== GUERREIRO ===");
        System.out.println(guerreiro);

        System.out.println("=== MAGO ===");
        System.out.println(mago);

        System.out.println("=== ARQUEIRO ===");
        System.out.println(arqueiro);
    }
}
