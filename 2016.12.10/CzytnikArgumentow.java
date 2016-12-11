public class CzytnikArgumentow {

    static String[] tab = {"Please give your professional license code",
            "Why you need USB?", "Wait for DLC", "Pies", "ktory", "jeździł", "koleją"};

    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Złe argumenty: za mało argumentow");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        String polecenie = args[2];
        switch (polecenie) {
            case "add":
                System.out.println(x + y);
                break;
            case "multiply":
                System.out.println(x * y);
                break;
            default:
                System.out.println(tab[(int)(Math.random() * tab.length)]);
        }



    }
}
