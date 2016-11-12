/**
 * Created by lukaszlesniewski on 12.11.2016.
 */
public class Portfel {

    String waluta; //PLN, CHR, JPN

    private int pln;
    private int gr;

    public void add(int pln, int gr) {
        this.pln += pln;
        this.gr += gr;
        if (this.gr >= 100) {
            this.gr -= 100;
            this.pln++;
        }
    }



}
