package exercicio3;

import exercicio1.Animal;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando o animal: " + animal.getNome() + " (Idade: " + animal.getIdade() + ")");
        animal.emitirSom();
    }
}
