public class Main {

    final static String[][] wiedza;

    static {
        wiedza = KlamerkiStos.wiedza;
    }

    public static String[][] readFromFile(String pathToFile) {
        String[][] x = {{"Koleżanki i koledzy", "Podobnie", "W ten sposób"},
            {"realizacja nakreślonych zadań programowych", "nowy model działalności organizacyjnej"},
            {"zmusza nas do przeanalizowania", "powoduje docenienie uwagi"},
            {"modelu rozwoju", "form oddziaływania"}};
        return x;
    }


    public static void main(String[] args) {

        for (String[] kolumna : wiedza) {
            int wielkoscKolumny = kolumna.length;
            System.out.println(kolumna[(int)(Math.random()*wielkoscKolumny)]);
        }

        //for (int i = 0; i < wiedza.length; i++) {
        //    String[] kolumna = wiedza[i];
        //}

    }
}
