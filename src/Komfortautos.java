class Komfortauto extends Luxusauto {
    private boolean massageSitze;

    public Komfortauto(String marke, String modell, int baujahr, double mietpreis, boolean massageSitze) {
        super(marke, modell, baujahr, mietpreis);
        this.massageSitze = massageSitze;
    }

    public boolean isMassageSitze() {
        return massageSitze;
    }

    public void setMassageSitze(boolean massageSitze) {
        this.massageSitze = massageSitze;
    }
}