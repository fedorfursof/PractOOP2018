import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int i = 0;
        recursion(i, n);
    }

    public static int recursion(int i, int n) {
        if (i < n) {
            i++;
            System.out.println(i);
            return recursion(i, n);
        }
        return 0;
    }
}
