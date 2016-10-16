public class Main {

    /**
     * Przeciążanie funkcji
     * czyli jedna nazwa, a wiele parametrów
     */
    static int dodaj(int a, int b) {
        return a + b;
    }

    static int dodaj(int a) {
        return a + 100;
    }

    static int dodaj(double x) {
        return (int)x + 1000;
    }

    /**
     * Własna funkcja statyczna w klasie Main
     */
    static void kupowaniePiw(KrataPiw krata, Piwo piwo, Student student) {

        if (student.czyJestZPJATK) {
            System.out.println("SIEMASZ KOLEGO!");
        } else {
            System.out.println("ECH, TO ZNOWU TY");
        }

        System.out.println(piwo.cena * krata.iloscPiw);

    }

    public static void main(String[] args) {

        //Przykład z programowaniem za pomocą złożeń funkcji
        System.out.println(dodaj(dodaj(2, 3), dodaj(5.0)));

        //Przykład programowania z własnymi klasami
        Student student = new Student();
        student.czyJestZPJATK = true;
        KrataPiw krata = new KrataPiw();
        krata.iloscPiw = 6;
        Piwo piwoPjatk = new Piwo();
        piwoPjatk.cena = 4.0f;

        //Wywowałnie funkcji na rzecz obiektów klas
        kupowaniePiw(krata, piwoPjatk, student);


    }
}
