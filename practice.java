public class practice {
    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));

        int a = 12, b = 18;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD: " + a);
    }
}