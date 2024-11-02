import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Anfibio extends Animal{

    public Anfibio(LocalDate fechaDeNacimiento, float peso, String nombreComun, String nombreCientifico, List<String> historialSalud, Date[] horarioAlimentacion) {
        super(fechaDeNacimiento, peso, nombreComun, nombreCientifico, historialSalud, horarioAlimentacion);
    }
}
