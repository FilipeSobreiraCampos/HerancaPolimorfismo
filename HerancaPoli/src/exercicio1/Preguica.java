package exercicio1;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está fazendo um som característico.");
    }

    @Override
    public void comportamento() {
        subirEmArvores();
    }

    // Comportamento específico
    public void subirEmArvores() {
        System.out.println("A preguiça está subindo em árvores.");
    }
}
