package BUILDER;

public interface PersonagemBuilder {

    PersonagemBuilder comNome(String nome);
    PersonagemBuilder comVida(int vida);
    PersonagemBuilder comMana(int mana);
    PersonagemBuilder comForca(int forca);
    PersonagemBuilder comInteligencia(int inteligencia);
    PersonagemBuilder comAgilidade(int agilidade);

    Personagem build();
}