/**
 * Created by lukaszlesniewski on 12.11.2016.
 */
public class Main2 {

    public static int metodaStudenta(char[] tab) {
        int sum = 0;
        int i   = 0;
        do {
            sum += tab[i];
            i++;
        } while (i < tab.length);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(metodaStudenta("".toCharArray()));
    }
}
