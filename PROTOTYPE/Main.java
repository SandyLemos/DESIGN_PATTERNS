package PROTOTYPE;

public class Main {
    public static void main(String[] args) {
        EnemyPrototype enemy = new Enemy("Goblin", 80, 10, 5, "Adaga");
        enemy.exibirInfo();
        enemy.atacar();

        System.out.println("\n--- Clonando o inimigo ---\n");

        EnemyPrototype enemyCopia = enemy.clone();
        enemyCopia.exibirInfo();
        enemyCopia.atacar();

        System.out.println("\n--- Inimigo criado pela Factory ---\n");

        EnemyPrototype orc = EnemyFactory.createEnemy("OrcVerde");
        orc.exibirInfo();
        orc.atacar();
    }
}