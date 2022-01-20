public class MyCalculator {
    public static int powerVer1(int base,int exp){
        int result=1;
        for (int counter = 0; counter < exp; counter++) {
            result*=base;
        }
        return result;
    }

    public static int powerVer2(int base,int exp){
        int result=1;
        for (int counter = 0; counter < exp; counter++) {
            result*=base;
        }
        return result;
    }

    public static boolean needCoffee(){
        return false;
    }
}
