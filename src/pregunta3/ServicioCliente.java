package pregunta3;

// Clase que maneja la lógica de los clientes
public class ServicioCliente {    public Cliente obtenerCliente(String identificacion) {
    // Aquí podrías implementar lógica para buscar un cliente en una base de datos
    // Para el ejemplo, simplemente se devuelve un cliente ficticio
    return new Cliente(identificacion, "Nombre del Cliente", "correo@ejemplo.com");
}
}
