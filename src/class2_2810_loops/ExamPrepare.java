package class2_2810_loops;

import java.util.Scanner;

public class ExamPrepare {
    /*
    תרגיל 1
    =========
    כתבו תוכנה שקולטת מספרים דו ספרתי בלבד
    במידה והמשתמש הכניס כל מספר אחר, תוצג הודעת שגיאה
    יש להקליד 100 לסיום הקליטה
    בסוף התוכנית יש להציג את הנתונים הבאים:
    1. ממוצע
    2. המספר הנמוך ביותר
    3. המספר הגבוה ביותר

    הערה: אין להשתמש ב -- !!!!
     */

    public static void main(String[] args) {
        int userNumber; //for getting user numbers
        int avg = 0; //for calculation average
        int lowNumber = 100; //putting the highest number that we can use
        int highNumber = 0; //putting the lowest number that we can use
        int counter = 0; //counting the number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two digit number, 100 to stop input");
        do {
            userNumber = input.nextInt();
            if (userNumber == 100) {
                continue;
            }

            if (userNumber > 99 || userNumber < 10) {
                System.out.println("You little piece of s****, only two digits");
                continue;
            }

            //avg
            counter++;
            avg += userNumber;
            //minimum
//            if (userNumber<lowNumber){
//                lowNumber=userNumber;
//            }
            lowNumber = userNumber < lowNumber ? userNumber : lowNumber;
            //maximum
            highNumber = userNumber > highNumber ? userNumber : highNumber;
        } while (userNumber != 100);
        if (counter == 0) {
            System.out.println("No Solution for you !!!");
        } else {
            System.out.printf("avg: %d, lowest number %d highest number: %d",
                    avg / counter, lowNumber, highNumber);
        }
    }


}
