public class Main {

    static void setA(int[][] j) {
        j[2][1] = 4;
    }

    static void setA(int tab) {
        tab--;
        System.out.println(tab);
    }

    static String setA(String s) {
        char[] tmp = s.toCharArray();
        tmp[1] = 'd';
        System.out.println((int)tmp[tmp.length - 1]);
        s = new String(tmp);
        System.out.println(s);
        return s;
        //return tmp.length > 2 ? s : "Ala ma traktor";
    }

    public static void main(String[] args) {

        int[][] tab = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        int j = 45;

        String s = "Ala ma kota";

        setA(tab);
        setA(j);
        s = setA(s);

        System.out.println(tab);
        System.out.println(j);
        System.out.println(s);

    }
}
