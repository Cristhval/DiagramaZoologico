import java.time.LocalDate;
import java.util.Date;

public class Cuidador extends Persona implements Contrato{

    private String animalAsignado;

    public Cuidador(String nombre, String cedula, LocalDate fechaNacimiento, String animalAsignado) {
        super(nombre, cedula, fechaNacimiento);
        this.animalAsignado = animalAsignado;
    }

    public void alimentarAnimales(){

    }

    @Override
    public void cuidarAnimal() {

    }

    @Override
    public void horarioTrabajo() {

    }
}
