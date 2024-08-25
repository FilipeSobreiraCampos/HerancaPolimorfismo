package exercicio2;

import exercicio1.Animal;
import exercicio1.Cachorro;
import exercicio1.Cavalo;
import exercicio1.Preguica;

public class MainExc2 {
    public static void main(String[] args) {
        // Cria instâncias dos diferentes tipos de animais
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 7);
        Animal preguica = new Preguica("Sid", 3);

        // Array de animais para iteração polimórfica
        Animal[] animais = {cachorro, cavalo, preguica};

        // Chama o método emitirSom() para cada animal de forma polimórfica
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
