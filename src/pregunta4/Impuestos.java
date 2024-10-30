package pregunta4;

// Aplicar el principio de variaciones protegidas al siguiente codigo
public class Impuestos {
    private CalculadorImpuestos calculadorImpuestos;

    public Impuestos(CalculadorImpuestos calculadorImpuestos) {
        this.calculadorImpuestos = calculadorImpuestos;
    }

    public void calcularImpuestos(double valor) {
        calculadorImpuestos.calcularImpuestos(valor);
    }
}

