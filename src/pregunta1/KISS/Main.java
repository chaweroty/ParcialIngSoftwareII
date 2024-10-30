import pregunta1.KISS.OrdenEstado;

public class Main {
    public static void main(String[] args) {
        OrdenEstado ordenEstado = new OrdenEstado();

        int[] ordenIds = { 25, 75, 150};


        for (int ordenId : ordenIds) {
            String estado = ordenEstado.obtenerEstado(ordenId);
            System.out.println("El estado de la orden con  el ID: " + ordenId + " es: " + estado);
        }
    }
}