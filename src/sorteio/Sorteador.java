package sorteio;

import java.util.Random;

public class Sorteador {

    private static final Random RANDOM = new Random(); /* Essa classe é usada para gerar numeros aleatorios */

    public static <T> T sortear(T[] objetos) { /* 'T' - Type  - tipo parametrizado, tipo generico */
        if (objetos.length == 0) {
            throw new IllegalArgumentException("Mínimo de 1 objeto requerido");
        }

        int posicao = RANDOM.nextInt(objetos.length);
        return objetos[posicao];
    }

}