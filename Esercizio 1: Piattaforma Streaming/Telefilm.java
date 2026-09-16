public class Telefilm {

    private String nome;
    private String genere;
    private boolean produzioneInCorso;
    private Stagione[] stagioni;

    // Costruttore di default
    public Telefilm() {
        nome = "";
        genere = "";
        produzioneInCorso = false;
        stagioni = new Stagione[0];
    }

    // Costruttore parametrizzato
    public Telefilm(String nome, String genere, boolean produzioneInCorso, Stagione[] stagioni) {
        this.nome = nome;
        this.genere = genere;
        this.produzioneInCorso = produzioneInCorso;
        this.stagioni = stagioni;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public boolean isProduzioneInCorso() {
        return produzioneInCorso;
    }

    public void setProduzioneInCorso(boolean produzioneInCorso) {
        this.produzioneInCorso = produzioneInCorso;
    }

    public Stagione[] getStagioni() {
        return stagioni;
    }

    public void setStagioni(Stagione[] stagioni) {
        this.stagioni = stagioni;
    }

    // Calcola il numero medio di episodi per stagione
    public double numeroMedioPuntate() {

        if (stagioni == null || stagioni.length == 0) {
            return 0;
        }

        int somma = 0;

        for (int i = 0; i < stagioni.length; i++) {
            somma += stagioni[i].getNumeroEpisodi();
        }

        return (double) somma / stagioni.length;
    }

    // Verifica se uno sceneggiatore è presente in almeno una stagione
    public boolean cercaSceneggiatore(String nomeSceneggiatore) {

        if (stagioni == null) {
            return false;
        }

        for (int i = 0; i < stagioni.length; i++) {

            if (stagioni[i].getSceneggiatore().equalsIgnoreCase(nomeSceneggiatore)) {
                return true;
            }
        }

        return false;
    }

    // Ordina le stagioni in base al numero della stagione
    public void ordinaStagioni() {

        if (stagioni == null) {
            return;
        }

        for (int i = 0; i < stagioni.length - 1; i++) {

            for (int j = i + 1; j < stagioni.length; j++) {

                if (stagioni[i].getNumeroStagione() > stagioni[j].getNumeroStagione()) {

                    Stagione temp = stagioni[i];
                    stagioni[i] = stagioni[j];
                    stagioni[j] = temp;
                }
            }
        }
    }

    // Metodo toString
    @Override
    public String toString() {

        String risultato = "Nome telefilm: " + nome +
                "\nGenere: " + genere +
                "\nProduzione in corso: " + produzioneInCorso +
                "\nNumero stagioni: " + stagioni.length +
                "\n";

        for (int i = 0; i < stagioni.length; i++) {
            risultato += "\n" + stagioni[i] + "\n";
        }

        return risultato;
    }
}