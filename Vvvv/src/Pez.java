import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Pez extends Animal{

    public Pez(LocalDate fechaDeNacimiento, float peso, String nombreComun, String nombreCientifico, List<String> historialSalud, Date[] horarioAlimentacion) {
        super(fechaDeNacimiento, peso, nombreComun, nombreCientifico, historialSalud, horarioAlimentacion);
    }
}
