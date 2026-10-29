public class Main {
    public static void main(String[] args) {
        Kopi kopiBiasa = new Kopi();

        Kopi kopiSusu = new Kopi() {
            @Override
            public void racik() {
                System.out.println("Racikan1: Ekspreso + Susu UHT + Gula Aren.");
            }
        };

        kopiBiasa.racik();
        kopiSusu.racik();
    }
}