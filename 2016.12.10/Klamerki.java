public class Klamerki {

    final static String GOOD_MESSAGE = "Ciąg jest poprawny";
    final static String TO_MUCH_MESSAGE = "Za dużo zamykasz...";
    final static String TO_LESS_MESSAGE = "Za mało zamykasz...";

    public static void main(String[] args) {
        char[] wejscie = {'}', '}',  'a', 'b', '}', '}'};

        int licznik = 0;

        for (char znak : wejscie) {
            switch (znak) {
                case '}':
                    licznik--;
                    break;
                case '{':
                    licznik++;
                    break;
                default:
                    System.out.println(znak);
            }
            if (licznik < 0) {
                break; //Dr Tomaszewski nie patrzy
            }
        }

        if (licznik == 0) {
            System.out.println(GOOD_MESSAGE);
        } else if (licznik < 0) {
            System.out.println(TO_MUCH_MESSAGE);
        } else if (licznik > 0) {
            System.out.println(TO_LESS_MESSAGE);
        }

    }

}
