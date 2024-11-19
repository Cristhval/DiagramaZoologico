import java.util.ArrayList;
import java.util.List;

public class Administracion {

    private List<Empleado> empleados;
    private Zoologico zoologico;

    // Constructor que inicializa la lista de empleados
    public Administracion(Zoologico zoologico) {
        this.empleados = new ArrayList<>();
        this.zoologico = zoologico;
    }

    // Metodo para añadir empleados a la administracion
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Getter para la lista de empleados
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    // Setter para la lista de empleados
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    public Zoologico getZoologico() {
        return zoologico;
    }

    public void setZoologico(Zoologico zoologico) {
        this.zoologico = zoologico;
    }

    // Metodo para gestionar las actividades del zoologico
    public void gestionarZoologico() {
        System.out.println("Iniciando gestion del zoologico en la direccion: " + zoologico.getDireccion());

        for (Empleado empleado : empleados) {
            System.out.println("Asignando tareas a " + empleado.getNombre());

            // Limpieza de habitat si el empleado tiene uno asignado
            empleado.limpiarZoologico();

            // Supervision de animales
            empleado.cuidarAnimal();
        }
    }

}
