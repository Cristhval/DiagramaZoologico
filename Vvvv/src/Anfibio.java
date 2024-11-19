import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Anfibio extends Animal {

    // Constructor que recibe todos los parametros requeridos
    public Anfibio(LocalDate fechaDeNacimiento, float peso, String nombreComun,
                   String nombreCientifico, List<String> historialSalud, List<Date> horarioAlimentacion,
                   Reproduccion reproduccion, Cuidador cuidador, Veterinario veterinario,
                   Habitad habitad, Alimentacion alimentacion) {
        super(fechaDeNacimiento, peso, nombreComun, nombreCientifico, historialSalud,
                horarioAlimentacion, reproduccion, cuidador, veterinario, habitad, alimentacion);
    }

    // Metodo especifico para Anfibio
    public void mojarse() {
        System.out.println("El anfibio " + getNombreComun() + " se esta mojando para mantener su piel hidratada");
    }
}
