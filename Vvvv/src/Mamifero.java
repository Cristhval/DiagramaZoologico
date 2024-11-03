import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Mamifero extends Animal {
    public Mamifero(LocalDate fechaDeNacimiento, float peso, String nombreComun,
                    String nombreCientifico, List<String> historialSalud, List<Date> horarioAlimentacion,
                    Reproduccion reproduccion, Cuidador cuidador, Veterinario veterinario, Habitad habitad,
                    Alimentacion alimentacion) {
        super(fechaDeNacimiento, peso, nombreComun, nombreCientifico, historialSalud,
                horarioAlimentacion, reproduccion, cuidador, veterinario, habitad, alimentacion);
    }

    public void amamantar() {
        System.out.println("El mamifero " + getNombreComun() + " esta amamantando a sus crias");
    }
}
