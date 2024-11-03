public class Ovoviviparo extends Reproduccion{

    private int tiempoDesarrolloEnLaMadre;

    // Constructor de la clase Ovoviviparo
    public Ovoviviparo(String temporadaReproduccion, int cantidadCrias, int tiempoDesarrolloEnLaMadre) {
        super(temporadaReproduccion, cantidadCrias); // Llama al constructor de Reproduccion
        this.tiempoDesarrolloEnLaMadre = tiempoDesarrolloEnLaMadre;
    }

    public int getTiempoDesarrolloEnLaMadre() {
        return tiempoDesarrolloEnLaMadre;
    }

    public void setTiempoDesarrolloEnLaMadre(int tiempoDesarrolloEnLaMadre) {
        this.tiempoDesarrolloEnLaMadre = tiempoDesarrolloEnLaMadre;
    }

    // Metodo especifico para la clase Ovoviviparo
    public void mostrarDetallesOvoviviparo() {
        System.out.println("Temporada de Reproduccion: " + getTemporadaReproduccion());
        System.out.println("Cantidad de Crias: " + getCantidadCrias());
        System.out.println("Tiempo de Desarrollo en la Madre: " + tiempoDesarrolloEnLaMadre + " días");
    }
}
