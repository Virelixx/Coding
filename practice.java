
public class practice {
    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = arr[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }

        System.out.println("Largest: " + largest);

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest");
        } else {
            System.out.println("Second Largest: " + second);
        }
    }
}
