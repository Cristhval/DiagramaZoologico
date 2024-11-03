import java.time.LocalDate;
import java.util.Date;

public class Cliente extends Persona{


    private Boleto boleto;

    public Cliente(String nombre, String cedula, LocalDate fechaNacimiento, LocalDate now) {
        super(nombre, cedula, fechaNacimiento);
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    // Metodo para que el cliente compre un boleto
    public void comprarBoleto(float valor, String numero, Date fecha) {
        this.boleto = new Boleto(valor, numero, fecha);
        System.out.println("El cliente " + getNombre() + " ha comprado un boleto con numero " + numero);
    }

    // Metodo para validar el boleto del cliente
    public void validarBoleto() {
        if (boleto != null && boleto.validar()) {
            System.out.println("El boleto del cliente " + getNombre() + " es valido.");
        } else {
            System.out.println("El boleto del cliente " + getNombre() + " no es valido o no esta asignado.");
        }
    }

}
