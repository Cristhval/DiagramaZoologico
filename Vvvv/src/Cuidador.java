import java.time.LocalDate;


public class Cuidador extends Persona implements Contrato{

    private int animalAsignado;

    public Cuidador(String nombre, String cedula, LocalDate fechaNacimiento, int animalAsignado) {
        super(nombre, cedula, fechaNacimiento);
        this.animalAsignado = animalAsignado;
    }

    public Cuidador(String carlosLópez, String cui67890, LocalDate of) {
        super(carlosLópez, cui67890, of);
    }

    public int getAnimalAsignado(){
        return  animalAsignado;
    }

    public void setAnimalAsignado(int animalAsignado) {
        this.animalAsignado = animalAsignado;
    }

    public void alimentarAnimales(){
        System.out.println("El cuidador " + getNombre() + " esta alimentando a los animales.");
    }

    @Override
    public void cuidarAnimal() {
        System.out.println("El cuidador " + getNombre() + " se encuentra cuidando de los animales ");
    }

    @Override
    public void horarioTrabajo() {
        System.out.println("El cuidador " + getNombre() + " trabaja desde las 7 am hasta las 6pm ");
    }
}
