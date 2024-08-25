package exercicio8;

public class MainExerc8 {
    public static void main(String[] args) {
        Comissao gerente = new ComissaoGerente();
        Comissao supervisor = new ComissaoSupervisor();
        Comissao vendedor = new ComissaoVendedor();

        System.out.println("Comissão do Gerente: R$ " + String.format("%.2f", gerente.calcularComissao()));
        System.out.println("Comissão do Supervisor: R$ " + String.format("%.2f", supervisor.calcularComissao()));
        System.out.println("Comissão do Vendedor: R$ " + String.format("%.2f", vendedor.calcularComissao()));
    }
}
