import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a,b;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a+b);
        }

    }
}