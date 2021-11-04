package Class3_0211;

public class targil3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = counter * 3;
            System.out.print(numbers[counter] + " ");
        }
    }
}
