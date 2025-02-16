package unit05;

public class ForExample {
    public static void main(String[] args) {
        int[] array = { 0, 9, 1, 8, 2, 7, 3, 6, 4, 5 };

        for (int i=0; i<array.length; i++) {
            int element = array[i];
            System.out.print(element + " ");
        }
        System.out.println();

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }        
}
