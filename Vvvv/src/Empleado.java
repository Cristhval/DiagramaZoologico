import java.time.LocalDate;


public class Empleado extends Persona implements Contrato{

    private Habitad habitad;

    public Empleado(String nombre, String cedula, LocalDate fechaNacimiento){
        super(nombre, cedula, fechaNacimiento);
    }

    public Habitad getHabitad() {
        return habitad;
    }

    public void setHabitad(Habitad habitad) {
        this.habitad = habitad;
    }

    public void limpiarZoologico(){
        if (habitad != null) {
            System.out.println("El empleado " + getNombre() + " esta limpiando el habitat de tipo " + habitad.getTipoHabitad());
            habitad.limpiarHabitad();
        } else {
            System.out.println("El empleado " + getNombre() + " no tiene un habitat asignado para limpiar.");
        }
    }

    @Override
    public void cuidarAnimal() {
        System.out.println("El empleado " + getNombre() + " se encuentra atento de que no molesten a los animales ");
    }

    @Override
    public void horarioTrabajo() {
        System.out.println("El empleado " + getNombre() + " trabaja desde las 7 am hasta las 6pm ");
    }
}
