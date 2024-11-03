import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Reptil extends Animal {
    public Reptil(LocalDate fechaDeNacimiento, float peso, String nombreComun,
                  String nombreCientifico, List<String> historialSalud, List<Date> horarioAlimentacion,
                  Reproduccion reproduccion, Cuidador cuidador, Veterinario veterinario, Habitad habitad) {
        super(fechaDeNacimiento, peso, nombreComun, nombreCientifico, historialSalud,
                horarioAlimentacion, reproduccion, cuidador, veterinario, habitad, null); // Aqui se debe pasar null si Alimentacion no es requerido
    }

    public void tomarElSol() {
        System.out.println("El reptil " + getNombreComun() + " esta tomando el sol");
    }
}
