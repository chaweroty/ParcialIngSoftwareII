package pregunta4;

public class Main {
    public static void main(String[] args) {
        CalculadorImpuestos calculadorColombia = new CalculadorImpuestosColombia();
        CalculadorImpuestos calculadorEEUU = new CalculadorImpuestosEEUU();
        CalculadorImpuestos calculadorFrancia = new CalculadorImpuestosFrancia();

        double valor = 100;

        calculadorColombia.calcularImpuestos(valor);
        calculadorEEUU.calcularImpuestos(valor);
        calculadorFrancia.calcularImpuestos(valor);
    }
}
