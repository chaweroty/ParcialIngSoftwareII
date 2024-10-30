package pregunta3;
public class FacturaElectronica {
    private String codigo;
    private double total;
    private String numeroElectronico;
    private Cliente cliente;

    public FacturaElectronica(String codigo, double total, String numeroElectronico, Cliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.numeroElectronico = numeroElectronico;
        this.cliente = cliente;
    }

    // Getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNumeroElectronico() {
        return numeroElectronico;
    }

    public void setNumeroElectronico(String numeroElectronico) {
        this.numeroElectronico = numeroElectronico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}