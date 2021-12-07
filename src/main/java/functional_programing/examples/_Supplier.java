package functional_programing.examples;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("your DB url : "+getUrl());

        //supplier - don't get any arguments, but return an object
        Supplier<List<String>> getDBConnection = ()->List.of(
                "jdbc://localhost:3309/users",
                "jdbc://localhost:3309/customers"
        );
        System.out.println(getDBConnection.get());
    }

    public static List<String> getUrl(){
        return List.of(
                "jdbc://localhost:3309/users",
                "jdbc://localhost:3309/customers"
        );
    }
}
