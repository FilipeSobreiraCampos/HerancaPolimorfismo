package exercicio4;

import exercicio1.Animal;
import exercicio1.Cachorro;
import exercicio1.Cavalo;
import exercicio1.Preguica;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Rex", 5);
        jaulas[1] = new Cavalo("Spirit", 7);
        jaulas[2] = new Preguica("Sid", 3);
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
                if (animal instanceof Cachorro) {
                    ((Cachorro) animal).correr();
                } else if (animal instanceof Cavalo) {
                    ((Cavalo) animal).correr();
                }
            } else if (animal instanceof Preguica) {
                ((Preguica) animal).subirEmArvores();
            }
        }
    }
}
