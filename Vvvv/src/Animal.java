import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public abstract class Animal {

    protected LocalDate fechaDeNacimiento;
    protected float peso;
    protected String nombreComun;
    protected String nombreCientifico;
    private List<String> historialSalud;
    private Date[] horarioAlimentacion;

    public Animal(LocalDate fechaDeNacimiento, float peso, String nombreComun, String nombreCientifico,
                  List<String> historialSalud, Date[]horarioAlimentacion){
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.historialSalud = historialSalud;
        this.nombreComun = nombreComun;
        this.horarioAlimentacion = horarioAlimentacion;
        this.nombreCientifico = nombreCientifico;
        this.peso = peso;
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

    public Date[] getHorarioAlimentacion() {
        return horarioAlimentacion;
    }

    public void setHorarioAlimentacion(Date[] horarioAlimentacion) {
        this.horarioAlimentacion = horarioAlimentacion;
    }

    public List<String> getHistorialSalud() {
        return historialSalud;
    }

    public void setHistorialSalud(List<String> historialSalud) {
        this.historialSalud = historialSalud;
    }

    public void actualizarHistorialSalud(){


    }

    public void registrarHorarioAlimentacion(){

    }

    public void definirAlimentacion(Alimentacion alimentacion){
        System.out.println(nombreComun + " se está alimentando.");
        alimentacion.mostrarTipoAlimentacion();

    }

    public void registarReproduccion(){


    }

}
