package pregunta1.DRY;

public class Main {
    public static void main(String[] args) {

        Orden orden = new Orden();
        double precio = 100.0;

        double totalConImpuesto = orden.calcularTotalConimpuesto(precio);
        System.out.println("Total con impuesto es de: " + totalConImpuesto);

        double descuento = 20.0;

        double totalConDescuento = orden.calcularDescuentoTotal(precio, descuento);
        System.out.println("Total con descuento y después impuesto fue de: " + totalConDescuento);
    }
}
