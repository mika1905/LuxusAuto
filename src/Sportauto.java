class Sportauto extends Luxusauto {
    private int ps;

    public Sportauto(String marke, String modell, int baujahr, double mietpreis, int ps) {
        super(marke, modell, baujahr, mietpreis);
        this.ps = ps;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
