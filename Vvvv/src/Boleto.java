import java.util.Date;

public class Boleto {

    private float valor;
    private String numero;
    private Date fecha;


    public Boleto(float valor, String numero, Date fecha){
        this.fecha = fecha;
        this.numero = numero;
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public boolean validar(){


        return false;
    }

}
