public class Stagione {

    private int numeroEpisodi;
    private String sceneggiatore;
    private String trama;
    private int numeroStagione;

    // Costruttore di default
    public Stagione() {
        numeroEpisodi = 0;
        sceneggiatore = "";
        trama = "";
        numeroStagione = 0;
    }

    // Costruttore parametrizzato
    public Stagione(int numeroEpisodi, String sceneggiatore, String trama, int numeroStagione) {
        this.numeroEpisodi = numeroEpisodi;
        this.sceneggiatore = sceneggiatore;
        this.trama = trama;
        this.numeroStagione = numeroStagione;
    }

    // Getter e Setter
    public int getNumeroEpisodi() {
        return numeroEpisodi;
    }

    public void setNumeroEpisodi(int numeroEpisodi) {
        this.numeroEpisodi = numeroEpisodi;
    }

    public String getSceneggiatore() {
        return sceneggiatore;
    }

    public void setSceneggiatore(String sceneggiatore) {
        this.sceneggiatore = sceneggiatore;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public int getNumeroStagione() {
        return numeroStagione;
    }

    public void setNumeroStagione(int numeroStagione) {
        this.numeroStagione = numeroStagione;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Stagione " + numeroStagione +
                "\nNumero episodi: " + numeroEpisodi +
                "\nSceneggiatore: " + sceneggiatore +
                "\nTrama: " + trama;
    }
}