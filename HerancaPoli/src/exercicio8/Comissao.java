package exercicio8;

import exercicio7.Empresa;

public abstract class Comissao extends Empresa {
    protected double adicional;

    public Comissao(double adicional) {
        this.adicional = adicional;
    }

    public abstract double calcularComissao();

    public double getAdicional() {
        return adicional;
    }
}

