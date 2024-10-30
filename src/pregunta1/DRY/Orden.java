package pregunta1.DRY;
public class Orden {
    private static final double Tasa_impuesto = 0.1;
    private double calcularImpuesto(double precio) {
        return precio * Tasa_impuesto;
    }
    public double calcularTotalConimpuesto(double precio) {
        double impuesto = calcularImpuesto(precio);
        return precio + impuesto;
    }
    public double calcularDescuentoTotal(double precio, double descuento) {
        double descuentoPrecio = precio - descuento;
        double impuesto = calcularImpuesto(descuentoPrecio);
        return descuentoPrecio + impuesto;
    }
}



