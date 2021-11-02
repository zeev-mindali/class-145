package class1_2610.class1_2160_if.class1_2610_basic;

import java.util.Scanner;

public class CalcVat {
    public static void main(String[] args) {
        int productPrice;
        double productVAT;
        //final will be all in upper case -> משתנה קבוע יירשם באותיות גדולות בלבד
        final double VAT = 1.17; //final -> const -> kavua -> קבוע
        char letter = 'a';
        Scanner input = new Scanner(System.in); //will be write only once

        System.out.println("please enter product price:");
        productPrice = input.nextInt(); //get input from user :)
        //vat = input.nextDouble(); //vat is final
        //productVAT = productPrice*1.17; //hard coded
        //vat=1; can not change value of final in run time...
        productVAT = productPrice * VAT; //a variable holding vat value
        System.out.println("total price :" + productVAT);


    }
}
