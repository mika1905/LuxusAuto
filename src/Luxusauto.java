class Luxusauto {
    private String marke;
    private String modell;
    private int baujahr;
    private double mietpreis; // pro Tag in Euro

    public Luxusauto(String marke, String modell, int baujahr, double mietpreis) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.mietpreis = mietpreis;
    }

    // Getter und Setter Methoden
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public double getMietpreis() {
        return mietpreis;
    }

    public void setMietpreis(double mietpreis) {
        this.mietpreis = mietpreis;
    }

    // Methode zur Berechnung der Mietkosten basierend auf der Anzahl der Tage
    public double berechneMietkosten(int tage) {
        return mietpreis * tage;
    }
}