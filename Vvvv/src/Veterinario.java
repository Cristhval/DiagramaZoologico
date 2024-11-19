import java.time.LocalDate;


public class Veterinario extends  Persona implements Contrato{

    private String especialidad;

    public Veterinario(String nombre, String cedula, LocalDate fechaNacimiento, String especialidad) {
        super(nombre, cedula, fechaNacimiento);
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){
        return  especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void cuidarAnimal() {
        System.out.println("El Veterinario " + getNombre() + " se encuentra al pendiente de los animales ");
    }

    @Override
    public void horarioTrabajo() {
        System.out.println("El Veterinario " + getNombre() + " trabaja desde las 6 am hasta las 5 pm y" +
                " se mantiene al contacto por alguna emergencia");
    }
}
