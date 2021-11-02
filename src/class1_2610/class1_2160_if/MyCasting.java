package class1_2610.class1_2160_if;

import java.text.DecimalFormat;


//ctrl+alt+l -> formatting the code.... indutchia (not the keraim)
public class MyCasting {
    public static void main(String[] args) {
        char ch = 'a';
        int n1 = 5, n2 = 7;
        double d1 = 2.5;

        /*
        System.out.println(ch);
        System.out.println(ch+1);
        n1 = (ch+1) + 2;
        System.out.println(n1);
        */

        DecimalFormat talBait = new DecimalFormat("###,###.##");

        System.out.println(talBait.format(134534523.45678));

        int num = -50;

        int absNum = Math.abs(num);
    }
}
