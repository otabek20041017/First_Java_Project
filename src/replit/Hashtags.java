package replit;
import java.util.Scanner;
public class Hashtags {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print('#');
        }
    }
}