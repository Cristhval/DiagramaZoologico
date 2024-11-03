public class Viviparo extends Reproduccion{

    private int tiempoDeGestacion;

    public Viviparo(String temporadaReproduccion, int cantidadCrias, int tiempoDeGestacion) {
        super(temporadaReproduccion, cantidadCrias); // Llama al constructor de Reproduccion
        this.tiempoDeGestacion = tiempoDeGestacion;
    }

    public int getTiempoDeGestacion() {
        return tiempoDeGestacion;
    }

    public void setTiempoDeGestacion(int tiempoDeGestacion) {
        this.tiempoDeGestacion = tiempoDeGestacion;
    }

    // Metodo especifico para la clase Viviparo
    public void mostrarDetallesViviparo() {
        System.out.println("Temporada de Reproduccion: " + getTemporadaReproduccion());
        System.out.println("Cantidad de Crias: " + getCantidadCrias());
        System.out.println("Tiempo de Gestación: " + tiempoDeGestacion + " dias");
    }
}
