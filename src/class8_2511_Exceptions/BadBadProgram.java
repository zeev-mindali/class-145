package class8_2511_Exceptions;

import java.util.Scanner;

public class BadBadProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int nudnik;

        System.out.println("Please enter two numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        try {
            nudnik = divide(num1, num2);
        } catch (AlonException e) {
            System.out.println("Tell alon go home");
        } catch (AnnaException e) {
            System.out.println("Mess with the best and die like the rest");
        } catch (TalException e) {
            System.out.println("Hello my brother from another mother");
        }
    }

    private static int divide(int num1, int num2) throws TalException, AlonException, AnnaException {
        if (num2 == 0) {
            throw new TalException();
        }
        if (num1 * num2 < 0) {
            throw new AnnaException();
        }
        System.out.println(num1 / num2);
        return num1 / num2;
    }
}
