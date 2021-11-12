package Day23;

public class UsefulMethods {

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    // sum numbers
    public static void sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
    }

}
