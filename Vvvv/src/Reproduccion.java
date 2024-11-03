public class Reproduccion {

    private String temporadaReproduccion;
    private int cantidadCrias;

    public Reproduccion(String temporadaReproduccion, int cantidadCrias){
        this.temporadaReproduccion = temporadaReproduccion;
        this.cantidadCrias = cantidadCrias;
    }

    public String getTemporadaReproduccion(){
        return temporadaReproduccion;
    }

    public void setTemporadaReproduccion(String temporadaReproduccion) {
        this.temporadaReproduccion = temporadaReproduccion;
    }

    public int getCantidadCrias() {
        return cantidadCrias;
    }

    public void setCantidadCrias(int cantidadCrias) {
        this.cantidadCrias = cantidadCrias;
    }

    public void registrarNacimiento(){
        cantidadCrias++;
        System.out.println("nacimiento registrado, el total de crias es: " + cantidadCrias);
    }
}
