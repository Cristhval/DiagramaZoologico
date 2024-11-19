import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class Animal {

    protected LocalDate fechaDeNacimiento;
    protected float peso;
    protected String nombreComun;
    protected String nombreCientifico;
    protected List<String> historialSalud;
    protected List<Date> horarioAlimentacion;
    protected Reproduccion reproduccion;
    protected Cuidador cuidador;
    protected Veterinario veterinario;
    protected Habitad habitad;
    protected Alimentacion alimentacion;

    public Animal(LocalDate fechaDeNacimiento, float peso, String nombreComun, String nombreCientifico,
                  List<String> historialSalud, List<Date>horarioAlimentacion, Reproduccion reproduccion,
                  Cuidador cuidador, Veterinario veterinario, Habitad habitad, Alimentacion alimentacion){

        this.fechaDeNacimiento = fechaDeNacimiento;
        this.historialSalud = historialSalud;
        this.nombreComun = nombreComun;
        this.horarioAlimentacion = horarioAlimentacion != null ? horarioAlimentacion : new ArrayList<>();
        this.nombreCientifico = nombreCientifico;
        this.peso = peso;
        this.reproduccion = reproduccion;
        this.cuidador = cuidador;
        this.veterinario = veterinario;
        this.habitad = habitad;
        this.alimentacion = alimentacion;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombreCientifico(){
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public List<Date> getHorarioAlimentacion() {
        return horarioAlimentacion;
    }

    public void setHorarioAlimentacion(List<Date> horarioAlimentacion) {
        this.horarioAlimentacion = horarioAlimentacion;
    }

    public List<String> getHistorialSalud() {
        return historialSalud;
    }

    public void setHistorialSalud(List<String> historialSalud) {
        this.historialSalud = historialSalud;
    }
    public Reproduccion getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(Reproduccion reproduccion) {
        this.reproduccion = reproduccion;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    public Alimentacion getAlimentacion(){
        return alimentacion;
    }

    public void setAlimentacion(Alimentacion alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void actualizarHistorialSalud(String registro){
        historialSalud.add(registro);
        System.out.println("Historial de salud actualizado para " + nombreComun + ": " + registro);
    }

    public void serAtendidoPorVeterinario() {
        if (veterinario != null) {
            System.out.println(nombreComun + " esta siendo atendido por el veterinario " + veterinario.getNombre());
            veterinario.cuidarAnimal();

            // Registrar en el historial de salud la atencion del veterinario
            String registro = "Atendido por el veterinario " + veterinario.getNombre() + " el " + new Date();
            actualizarHistorialSalud(registro);
        } else {
            System.out.println("No hay veterinario asignado para " + nombreComun);
        }
    }


    public void registrarHorarioAlimentacion(){
        horarioAlimentacion.add(new Date());  // Agrega la fecha y hora actual
        System.out.println("Horario de alimentacion registrado para " + nombreComun + " a las " + new Date());

    }


    public void definirAlimentacion(Alimentacion alimentacion){
        System.out.println(nombreComun + " se esta alimentando");
        alimentacion.mostrarTipoAlimentacion();

    }
    public void serAlimentadoPorCuidador() {
        if (cuidador != null) {
            System.out.println(nombreComun + " esta siendo alimentado por " + cuidador.getNombre());
            cuidador.alimentarAnimales();
            registrarHorarioAlimentacion();  // Registra la hora actual de alimentacion
        } else {
            System.out.println("No hay cuidador asignado para " + nombreComun);
        }
    }

    public void registarReproduccion(){

        if (reproduccion != null){
            reproduccion.registrarNacimiento();
            System.out.println("reproduccion registrada para " + nombreComun);
        } else{
            System.out.println("Este animal no tiene datos de haberse reproducido ");
        }

    }


    // Metodo para limpiar el habitat
    public void limpiarHabitad() {
        if (habitad != null) {
            habitad.limpiarHabitad();
        } else {
            System.out.println("Este animal no tiene un habitat asignado.");
        }
    }
    public void mostrarInformacionAnimal() {
        System.out.println("Nombre Comun: " + nombreComun);
        System.out.println("Nombre Cientifico: " + nombreCientifico);
        System.out.println("Peso: " + peso + " kg");
        if (alimentacion != null) {
            System.out.println("Tipo de alimentacion: "+ alimentacion.mostrarTipoAlimentacion());
        } else {
            System.out.println("Tipo de alimentacion: No especificado");
        }
    }

}
