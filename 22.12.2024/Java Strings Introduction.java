import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        scanner.close();

        System.out.println(a.length() + b.length());

        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + 
                           b.substring(0, 1).toUpperCase() + b.substring(1));
    }
}
