class Supersportauto extends Sportauto {
    private boolean spoiler;

    public Supersportauto(String marke, String modell, int baujahr, double mietpreis, int ps, boolean spoiler) {
        super(marke, modell, baujahr, mietpreis, ps);
        this.spoiler = spoiler;
    }

    public boolean hasSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }
}