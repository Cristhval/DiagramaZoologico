import java.util.Date;

public class Habitad {

    private Date[] horarioLimpieza;
    private String tipoHabitad;
    private Empleado empleado;

    public Habitad(Date[] horarioLimpieza, String tipoHabitad, Empleado empleado){

        this.horarioLimpieza = horarioLimpieza;
        this.tipoHabitad = tipoHabitad;
        this.empleado = empleado;
    }

    public Habitad(Date[] horariosLimpiezaMamifero, String savana, Cuidador cuidador1) {
    }

    public String getTipoHabitad(){
        
        return tipoHabitad;
    }
    public void setTipoHabitad(String tipoHabitad){
        this.tipoHabitad = tipoHabitad;
    }

    public Date[] getHorarioLimpieza(){
        return horarioLimpieza;
    }

    public void setHorarioLimpieza(Date[] horarioLimpieza) {
        this.horarioLimpieza = horarioLimpieza;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void limpiarHabitad(){
        if (empleado != null) {
            System.out.println("El habitat de tipo " + tipoHabitad + " esta siendo limpiado por " +
                    empleado.getNombre());
        } else {
            System.out.println("No hay empleado asignado para limpiar el habitat.");
        }
    }

}
