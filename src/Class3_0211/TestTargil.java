package Class3_0211;

import java.util.Scanner;

public class TestTargil {
    public static void main(String[] args) {
        final int TOTAL_GROOMS = 5;
        Scanner input = new Scanner(System.in);
        String[] victims = new String[TOTAL_GROOMS];

        System.out.println("Give five names for proposing Tal a wedding ring:");
        for (int counter = 0; counter < victims.length; counter++) {
            victims[counter] = input.nextLine();
        }

        System.out.println("our poor grooms:");
//        for (int counter=0;counter< victims.length;counter++){
//            System.out.println(victims[counter]);
//        }
        //       item    collection
        //junior
        for (String item : victims) {
            System.out.println(item);
        }

        
        int bestGroom = (int) (Math.random() * TOTAL_GROOMS);
        System.out.println("Tal wants choose:");
        System.out.println(victims[bestGroom]);
    }
}
