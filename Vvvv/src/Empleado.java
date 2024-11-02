import java.time.LocalDate;
import java.util.Date;

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

    }

    @Override
    public void cuidarAnimal() {

    }

    @Override
    public void horarioTrabajo() {

    }
}
