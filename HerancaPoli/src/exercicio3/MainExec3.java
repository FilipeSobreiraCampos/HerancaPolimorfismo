package exercicio3;

import exercicio1.Animal;
import exercicio1.Cachorro;
import exercicio1.Cavalo;
import exercicio1.Preguica;

public class MainExec3 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Aladdin", 7);
        Animal preguica = new Preguica("Sid", 3);

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
