package functional_programing.examples;

import functional_programing.beans.Customer;

import java.util.function.BiConsumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer vip = new Customer("Zeev","052-4043142");
        sayHello(vip,true);

        //when we don't need to return data, we can use Consumer
        BiConsumer<Customer,Boolean> sayHello2 = (user,showThePhone) ->
                System.out.println("Hello "+user.getCustomerName()+
                        ", thanks for registerting phone nunber: "+
                        (showThePhone?user.getCustomerPhone():"***-*******"));

        sayHello2.accept(vip,false);
    }

    private static void sayHello(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello "+customer.getCustomerName()+
                ", thanks for registerting phone nunber: "+
                (showPhoneNumber?customer.getCustomerPhone():"***-*******"));
    }
}
