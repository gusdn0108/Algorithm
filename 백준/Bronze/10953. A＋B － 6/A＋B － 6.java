import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] array = new int[n];


        for (int i = 0; i < n; i++) {
            String a = sc.next();
            int sum = 0;
            String[] split = a.split(",");
            for (int j = 0; j < split.length; j++) {
                array[j] = Integer.parseInt(split[j]);
                sum += array[j];
            }
            System.out.println(sum);
        }

    }
}