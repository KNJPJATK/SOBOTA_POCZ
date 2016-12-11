public class Stos {

    private int[] obiekty;
    private int i;

    public Stos() {
        obiekty = new int[10];
        i = -1;
    }

    public Stos(int wysokoscStosu) {
        obiekty = new int[wysokoscStosu];
        i = -1;
    }

    public int zdejmij() {
        if (i < 0) {
            powiamProgramisteZeJegoMarzeniaSaNiczym();
            return 0;
        }
        return obiekty[i--];
    }

    public void poloz(int element) {
        if (++i > obiekty.length - 1) {
            powiamProgramisteZeJegoMarzeniaSaNiczym();
            return;
        }
        obiekty[i] = element;
    }

    public boolean pusty() {
        return i == -1;
    }

    public boolean pelny() {
        return i == obiekty.length - 1;
    }

    private void powiamProgramisteZeJegoMarzeniaSaNiczym() {
        System.err.println("Zle!!!!!");
    }

}
