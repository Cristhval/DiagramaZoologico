import java.time.LocalDate;
import java.util.Date;

public class Cliente extends Persona{

    private Boleto boleto;

    public Cliente(String nombre, String cedula, LocalDate fechaNacimiento){
        super(nombre, cedula, fechaNacimiento);

    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }


}
