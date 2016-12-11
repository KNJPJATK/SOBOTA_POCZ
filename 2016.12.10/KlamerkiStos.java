public class KlamerkiStos {

    static String[][] wiedza = {{"fsdfssf", "fdsf"}};

    final static int wielkoscStosu = 10000;

    public static void main(String[] args) {
        char[] wejscie = {'{', '}', '{', '}'};

        Stos stos = new Stos(wielkoscStosu);

        for (char znak : wejscie) {
            switch (znak) {
                case '}':
                    stos.zdejmij();
                    break;
                case '{':
                    stos.poloz('{');
                    break;
                default:
                    System.out.println(znak);
            }
        }

        if (stos.pusty()) {
            System.out.println("Ciąg jest poprawny");
        }

    }
}
