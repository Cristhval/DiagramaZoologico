import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // Crear alimentaciones
        Alimentacion alimentacionCarnivora = new Alimentacion(true, false,
                false, false);
        Alimentacion alimentacionHervivora = new Alimentacion(false, false,
                true, false);
        Alimentacion alimentacionOmnivora = new Alimentacion(false, false,
                false, true);

        // Crear veterinarios
        Veterinario veterinario1 = new Veterinario("Dr. Juan Perez", "VET12345", LocalDate.of(1985,
                1, 15), "Veterinario de mamiferos");
        Veterinario veterinario2 = new Veterinario("Dra. Ana Gómez", "11035597", LocalDate.of(1990,
                6, 22), "Veterinario de reptiles");

        // Crear cuidadores
        Cuidador cuidador1 = new Cuidador("Carlos Lopez", "CUI67890", LocalDate.of(1980,
                5, 30));
        Cuidador cuidador2 = new Cuidador("Lucia Fernandez", "CUI09876", LocalDate.of(1992,
                11, 10));

        // Crear habitats
        Date[] horariosLimpiezaMamifero = {new Date(), new Date(System.currentTimeMillis() + 3600000)};
        Habitad habitadMamifero = new Habitad(horariosLimpiezaMamifero, "Savana", cuidador1);

        Date[] horariosLimpiezaPez = {new Date(), new Date(System.currentTimeMillis() + 7200000)};
        Habitad habitadPez = new Habitad(horariosLimpiezaPez, "Oceano", cuidador2);

        // Crear mamifero
        Mamifero leon = new Mamifero(
                LocalDate.of(2018, 5, 15),
                190.5f,
                "Leon",
                "Panthera leo",
                new ArrayList<>(), // Historial de salud
                new ArrayList<>(), // Horario de alimentacion
                new Viviparo("Primavera", 2, 110),
                cuidador1,
                veterinario1,
                habitadMamifero,
                alimentacionCarnivora // Alimentacion
        );

        // Crear pez
        Pez tiburon = new Pez(
                LocalDate.of(2015, 9, 1),
                300.0f,
                "Tiburon",
                "Carcharodon carcharias",
                new ArrayList<>(), // Historial de salud
                new ArrayList<>(), // Horario de alimentacion
                new Oviparo("Verano", 20, 50),
                cuidador2,
                veterinario2,
                "Agua salada",
                habitadPez,
                alimentacionCarnivora // Alimentacion
        );

        // Crear reptil
        Reptil cocodrilo = new Reptil(
                LocalDate.of(2012, 2, 20),
                500.0f,
                "Cocodrilo",
                "Crocodylus niloticus",
                new ArrayList<>(), // Historial de salud
                new ArrayList<>(), // Horario de alimentacion
                new Oviparo("Primavera", 30, 20),
                cuidador1,
                veterinario1,
                habitadMamifero // No se pasa Alimentación aqui
        );

        // Usar metodos de los animales
        leon.amamantar();
        tiburon.nadar();
        cocodrilo.tomarElSol();

        cuidador1.alimentarAnimales();
        cuidador2.cuidarAnimal();
        veterinario1.horarioTrabajo();

        cocodrilo.mostrarInformacionAnimal();
        tiburon.mostrarInformacionAnimal();
        leon.serAtendidoPorVeterinario();
        tiburon.registrarHorarioAlimentacion();
    }
}
