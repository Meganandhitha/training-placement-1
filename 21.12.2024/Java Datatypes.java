import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  

        for (int i = 0; i < t; i++) {
            try {
               
                long n = scanner.nextLong();

                System.out.println(n + " can be fitted in:");
                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }
                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }
                if (n >= -2147483648 && n <= 2147483647) {
                    System.out.println("* int");
                }
                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
