package exercicio4;

import exercicio1.Animal;
import exercicio1.Cachorro;
import exercicio1.Cavalo;
import exercicio1.Preguica;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        // Inicializa o array de jaulas com 10 posições
        jaulas = new Animal[10];

        // Preenche as jaulas com diferentes animais
        jaulas[0] = new Cachorro("Rex", 5);
        jaulas[1] = new Cavalo("Spirit", 7);
        jaulas[2] = new Preguica("Sid", 3);
        // Adicione mais animais conforme necessário para preencher as 10 jaulas
        jaulas[3] = new Cachorro("Max", 4);
        jaulas[4] = new Cavalo("Lightning", 6);
        jaulas[5] = new Preguica("Flora", 2);
        jaulas[6] = new Cachorro("Buddy", 8);
        jaulas[7] = new Cavalo("Thunder", 5);
        jaulas[8] = new Preguica("Luna", 4);
        jaulas[9] = new Cachorro("Bella", 1);
    }

    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            System.out.println("Jaula " + (i + 1) + ":");
            animal.emitirSom();

            if (animal instanceof Cachorro || animal instanceof Cavalo) {
                // Se o animal é um Cachorro ou Cavalo, faz ele correr
                if (animal instanceof Cachorro) {
                    ((Cachorro) animal).correr();
                } else if (animal instanceof Cavalo) {
                    ((Cavalo) animal).correr();
                }
            } else if (animal instanceof Preguica) {
                // Se o animal é uma Preguiça, faz ela subir em árvores
                ((Preguica) animal).subirEmArvores();
            }
        }
    }
}
