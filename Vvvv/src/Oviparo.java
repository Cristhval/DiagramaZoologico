public class Oviparo extends Reproduccion{

    private int cantidadHuevos;

    // Constructor de la clase Oviparo
    public Oviparo(String temporadaReproduccion, int cantidadCrias, int cantidadHuevos) {
        super(temporadaReproduccion, cantidadCrias); // Llama al constructor de Reproduccion
        this.cantidadHuevos = cantidadHuevos;
    }

    public int getCantidadHuevos() {
        return cantidadHuevos;
    }

    public void setCantidadHuevos(int cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    // Metodo especifico para la clase Oviparo
    public void mostrarDetallesOviparo() {
        System.out.println("Temporada de Reproduccion: " + getTemporadaReproduccion());
        System.out.println("Cantidad de Crias: " + getCantidadCrias());
        System.out.println("Cantidad de Huevos: " + cantidadHuevos);
    }
}
