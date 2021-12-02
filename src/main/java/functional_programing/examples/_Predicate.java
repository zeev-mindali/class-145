package functional_programing.examples;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        Predicate<String> isPhoneNumberIsValid2 = phoneNumber->
                phoneNumber.startsWith("05") && phoneNumber.length()==11;

        Predicate<String> containsNumber3 = phoneNumber->
                phoneNumber.contains("3");

        //System.out.println(isPhoneNumberValid("052-4043142"));
        System.out.println(isPhoneNumberIsValid2.and(containsNumber3).test("125-4043142"));

    }

    private static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("05") && phoneNumber.length()==11;
    }
}
