public class Musik {

    public void putar() {
        System.out.println("Musik sedang diputar");
    }

    public static void main(String[] args) {
        Musik biasa = new Musik();
        System.out.println("Sebelum:");
        biasa.putar();
        
        System.out.println();

        Musik anonim = new Musik() {
            @Override
            public void putar() {
                System.out.println("Musik diputar");
            }
        };
        System.out.println("Sesudah:");
        anonim.putar(); 
    }
}