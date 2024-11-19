import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Pez extends Animal {
    private String tipoAgua; // Agua dulce o salada

    public Pez(LocalDate fechaDeNacimiento, float peso, String nombreComun,
               String nombreCientifico, List<String> historialSalud, List<Date> horarioAlimentacion,
               Reproduccion reproduccion, Cuidador cuidador, Veterinario veterinario,
               String tipoAgua, Habitad habitad, Alimentacion alimentacion) {
        super(fechaDeNacimiento, peso, nombreComun, nombreCientifico, historialSalud,
                horarioAlimentacion, reproduccion, cuidador, veterinario, habitad, alimentacion);
        this.tipoAgua = tipoAgua;
    }

    public void nadar() {
        System.out.println("El pez " + getNombreComun() + " esta nadando");
    }
}
