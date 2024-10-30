package pregunta3;
public class Main {
    public static void main(String[] args) {
        ServicioCliente clienteService = new ServicioCliente();
        Cliente cliente = clienteService.obtenerCliente("10008234");

        FacturaFisica facturaFisica = new FacturaFisica("F01", 2000, cliente);
        FacturaElectronica facturaElectronica = new FacturaElectronica("F02", 4000, "E001", cliente);
    }
}