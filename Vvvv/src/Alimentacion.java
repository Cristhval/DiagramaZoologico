public class Alimentacion {

    private final boolean esCarronero;
    private final boolean esCarnivoro;
    private final boolean esHervivoro;
    private final boolean esOmnivoro;

    public Alimentacion(final boolean esCarnivoro, final boolean esCarronero,final boolean esHervivoro,
                        final boolean esOmnivoro){

        this.esCarnivoro = esCarnivoro;
        this.esCarronero = esCarronero;
        this.esHervivoro = esHervivoro;
        this.esOmnivoro = esOmnivoro;
    }

    public boolean isCarronero() {
        return esCarronero;
    }

    public boolean isCarnivoro() {
        return esCarnivoro;
    }

    public boolean isHervivoro() {
        return esHervivoro;
    }

    public boolean isOmnivoro() {
        return esOmnivoro;
    }


    public String mostrarTipoAlimentacion() {
        String tipoAlimentacion = "Tipo de alimentacion:";
        if (esCarronero) tipoAlimentacion += " Carronero";
        if (esCarnivoro) tipoAlimentacion += " Carnivoro";
        if (esHervivoro) tipoAlimentacion += " Herbivoro";
        if (esOmnivoro) tipoAlimentacion += " Omnívoro";
        return tipoAlimentacion;
    }

}
