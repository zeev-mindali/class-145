package functional_programing;

public class FunctionalProgramming {
    interface MathAble{
        int opertion(int a, int b);
    }
    public static void main(String[] args) {
        MathAble addition = (int a, int b) -> a+b;
        MathAble subtraction = (a,b) -> a-b;
        MathAble multiplication = (a,b) -> a*b;
        MathAble divide = (a,b)->{
            if (b==0) return 0;
            return a/b;
        };

        System.out.println("10 + 5 = "+addition.opertion(10,5));
        System.out.println("10 - 5 = "+subtraction.opertion(10,5));
        System.out.println("10 X 5 = "+multiplication.opertion(10,5));
        System.out.println("10 / 5 = "+divide.opertion(10,5));
    }

    private int simpleAddition(int a, int b){
        return a+b;
    }
}
