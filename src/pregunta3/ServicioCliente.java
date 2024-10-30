package pregunta3;

// Clase que maneja la lógica de los clientes
public class ServicioCliente {    public Cliente obtenerCliente(String identificacion) {
    return new Cliente(identificacion, "Nombre del Cliente", "correo@ejemplo.com");
}
}
