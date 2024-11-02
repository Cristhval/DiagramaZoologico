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


    public void mostrarTipoAlimentacion() {
        System.out.println("Tipo de alimentación:");
        if (esCarronero) System.out.println("- Carronero");
        if (esCarnivoro) System.out.println("- Carnívoro");
        if (esHervivoro) System.out.println("- Hervívoro");
        if (esOmnivoro) System.out.println("- Omnívoro");
    }

}
