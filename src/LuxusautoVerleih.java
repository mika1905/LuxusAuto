public class LuxusautoVerleih {
    public static void main(String[] args) {
        // Erstellen eines Komfortautos
        Komfortauto komfortauto = new Komfortauto("Mercedes", "S-Klasse", 2023, 300, true);
        System.out.println("Komfortauto:");
        System.out.println("Marke: " + komfortauto.getMarke());
        System.out.println("Modell: " + komfortauto.getModell());
        System.out.println("Baujahr: " + komfortauto.getBaujahr());
        System.out.println("Massage Sitze: " + komfortauto.isMassageSitze());
        System.out.println("Mietpreis pro Tag: " + komfortauto.getMietpreis() + " Euro");
        System.out.println();

        // Erstellen eines Sportautos
        Sportauto sportauto = new Sportauto("Ferrari", "488 GTB", 2022, 500, 660);
        System.out.println("Sportauto:");
        System.out.println("Marke: " + sportauto.getMarke());
        System.out.println("Modell: " + sportauto.getModell());
        System.out.println("Baujahr: " + sportauto.getBaujahr());
        System.out.println("PS: " + sportauto.getPs());
        System.out.println("Mietpreis pro Tag: " + sportauto.getMietpreis() + " Euro");
        System.out.println();

        // Erstellen eines Supersportautos
        Supersportauto supersportauto = new Supersportauto("Lamborghini", "Aventador SVJ", 2024, 1500, 770, true);
        System.out.println("Supersportauto:");
        System.out.println("Marke: " + supersportauto.getMarke());
        System.out.println("Modell: " + supersportauto.getModell());
        System.out.println("Baujahr: " + supersportauto.getBaujahr());
        System.out.println("PS: " + supersportauto.getPs());
        System.out.println("Spoiler: " + supersportauto.hasSpoiler());
        System.out.println("Mietpreis pro Tag: " + supersportauto.getMietpreis() + " Euro");
        System.out.println();
    }
}