package exercicio3;

import exercicio1.Animal;

public class Veterinario {
    // Método que examina o animal e faz com que ele emita um som
    public void examinar(Animal animal) {
        System.out.println("Examinando o animal: " + animal.getNome() + " (Idade: " + animal.getIdade() + ")");
        animal.emitirSom();  // Invoca o método emitirSom do animal
    }
}
