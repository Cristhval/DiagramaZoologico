import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Reptil extends Animal{

    public Reptil(LocalDate fechaDeNacimiento, float peso, String nombreComun, String nombreCientifico, List<String> historialSalud, Date[] horarioAlimentacion) {
        super(fechaDeNacimiento, peso, nombreComun, nombreCientifico, historialSalud, horarioAlimentacion);
    }
}
