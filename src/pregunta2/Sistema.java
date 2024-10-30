package pregunta2;

//Aplicar el principio alta cohesión y bajo acoplamiento al siguiente Código:
//Se tiene un sistema que envía notificaciones y guarda tareas en base de datos:

public class Sistema {
    private Notificador notificador;
    private GestorTareas gestorTareas;

    public Sistema() {
        this.notificador = new Notificador();
        this.gestorTareas = new GestorTareas();
    }

    public void enviarNotificacionPorSMS(Notificacion notificacion) {
        notificador.enviarNotificacionPorSMS(notificacion);
    }

    public void enviarNotificacionPorWhatsApp(Notificacion notificacion) {
        notificador.enviarNotificacionPorWhatsApp(notificacion);
    }

    public void insertarTarea(Tarea tarea) {
        gestorTareas.insertarTarea(tarea);
    }

    public void leerTarea() {
        gestorTareas.leerTarea();
    }
}
