import java.util.Date;

public class Cliente extends Persona{

    private Boleto boleto;

    public Cliente(String nombre, String cedula, Date fechaNacimiento){
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;

    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }


}
