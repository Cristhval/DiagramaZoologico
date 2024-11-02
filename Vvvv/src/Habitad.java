import java.util.Date;

public class Habitad {

    private Date[] horarioLimpieza;
    private String tipoHabitad;

    public Habitad(Date[] horarioLimpieza, String tipoHabitad){

        this.horarioLimpieza = horarioLimpieza;
        this.tipoHabitad = tipoHabitad;

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

    public void limpiarHabitad(){


    }

}
