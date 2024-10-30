package pregunta1.KISS;
// APLICAR PRINCIPIO KISS
public class OrdenEstado {
    public String obtenerEstado(int ordenId) {
        if (ordenId < 0) {
            return "orden invalida";
        }

        if (ordenId == 0) {
            return "pendiente";
        }

        if (ordenId > 100) {
            return "Completada";
        }

        if (ordenId > 50) {
            return "En progreso";
        }
        return "Pendiente";
    }
}
