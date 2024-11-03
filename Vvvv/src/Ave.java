import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Ave extends Animal {

    // Constructor que recibe todos los parametros requeridos
    public Ave(LocalDate fechaDeNacimiento, float peso, String nombreComun,
               String nombreCientifico, List<String> historialSalud, List<Date> horarioAlimentacion,
               Reproduccion reproduccion, Cuidador cuidador, Veterinario veterinario,Habitad habitad,
               Alimentacion alimentacion) {
        super(fechaDeNacimiento, peso, nombreComun, nombreCientifico, historialSalud,
                horarioAlimentacion, reproduccion, cuidador, veterinario, habitad, alimentacion);
    }

    // Metodo especifico para Ave
    public void volar() {
        System.out.println("El ave " + getNombreComun() + " esta volando");
    }
}
