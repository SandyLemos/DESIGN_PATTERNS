package PROTOTYPE;

import java.util.HashMap;
import java.util.Map;

public class EnemyFactory {
    private static final Map<String, EnemyPrototype> prototypes = new HashMap<>();

    static {
        prototypes.put("OrcVerde", new Enemy("Orc Verde", 100, 15, 10, "Machado"));
        prototypes.put("Troll", new Enemy("Troll", 200, 25, 20, "Clava"));
    }

    public static EnemyPrototype createEnemy(String value) {
        EnemyPrototype prototype = prototypes.get(value);
        if (prototype == null) {
            throw new IllegalArgumentException("Tipo desconhecido: " + value);
        }
        return prototype.clone();
    }
}
