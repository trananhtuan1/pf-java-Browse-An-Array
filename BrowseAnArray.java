import java.util.Arrays;

public class BrowseAnArray {
    public static void main(String[] args) {
        int[] array = createRandomArray(5);
        int[] copiedArray = copyArray(array);
        printArray(array);
        printArray(copiedArray);
    }

    public static int[] createRandomArray(int legth) {
        int[] numbers = new int[legth];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round(Math.random() * 10);
        }
        return numbers;
    }

    public static int[] copyArray(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    public static void printArray(int array[]){
        for (int x : array) {
            System.out.print(x + "\t");
        }
        System.out.println(" ");
    }
}