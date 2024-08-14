package Task_13Aug;

public class FindOddEven {
	public static void main(String[] args) {
        System.out.println("Even numbers up to 50:");
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Odd numbers up to 50:");
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
