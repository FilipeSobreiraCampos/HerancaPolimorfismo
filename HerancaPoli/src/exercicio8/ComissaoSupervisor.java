package exercicio8;

public class ComissaoSupervisor extends Comissao {

    public ComissaoSupervisor() {
        super(600.00); // Adicional de R$600,00
    }

    @Override
    public double calcularComissao() {
        return this.getAdicional();
    }

    @Override
    public String toString() {
        return "Comissão de Supervisor: R$ " + String.format("%.2f", calcularComissao());
    }
}
