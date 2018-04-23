public class BrowseAnArray {
    public static void main(String[] args) {
        int[] array = createRandomArray(5);
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static int[] createRandomArray(int legth) {
        int[] numbers = new int[legth];
        for(int i=0; i< numbers.length; i++) {
            numbers[i] = (int) Math.round(Math.random() * 10);
        }
        return numbers;
    }
}