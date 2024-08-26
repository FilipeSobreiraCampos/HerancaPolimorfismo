package exercicio1;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo está relinchando.");
    }

    @Override
    public void comportamento() {
        correr();
    }

    public void correr() {
        System.out.println("O cavalo está correndo.");
    }
}
