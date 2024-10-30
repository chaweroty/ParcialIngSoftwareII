package pregunta2;
import pregunta2.Notificacion;
import pregunta2.Sistema;
import pregunta2.Tarea;


public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Notificacion notificacion = new Notificacion("Debes ir por el queso");
        sistema.enviarNotificacionPorSMS(notificacion);

        sistema.enviarNotificacionPorWhatsApp(notificacion);

        Tarea tarea = new Tarea("Terminar taller ingenieria de software", "2023-10-31");
        sistema.insertarTarea(tarea);
        sistema.leerTarea();
    }
}