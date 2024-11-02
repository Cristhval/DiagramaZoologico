import java.time.LocalDate;
import java.util.Date;

public class Veterinario extends  Persona implements Contrato{

    private String especialidad;

    public Veterinario(String nombre, String cedula, LocalDate fechaNacimiento, String especialidad) {
        super(nombre, cedula, fechaNacimiento);
        this.especialidad = especialidad;
    }

    @Override
    public void cuidarAnimal() {

    }

    @Override
    public void horarioTrabajo() {

    }
}
