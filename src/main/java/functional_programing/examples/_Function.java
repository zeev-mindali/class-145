package functional_programing.examples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(""+increment);

        //Function takes 1 argument and produces 1 result
        Function<Integer,Integer> incrementByOneFunction = number -> number+1;
        Function<Integer,Integer> multiplyByTen = number -> number*10;

        Function<Integer,Integer> addOneAndMultiplyByTen =
                incrementByOneFunction
                .andThen(multiplyByTen);

        System.out.println(incrementByOneFunction.apply(10));

        System.out.println(addOneAndMultiplyByTen.apply(4));

        Function<Integer,String> convertInt = String::valueOf;

        System.out.println(convertInt.apply(10));

        BiFunction<Integer,Integer,Integer> addOneMultiplyTen = (number1,number2)->
                 (number1+1)*number2;

        System.out.println(addOneMultiplyTen.apply(10,50));
    }

    private static int incrementByOne(int number){
        return number+1;
    }
}
