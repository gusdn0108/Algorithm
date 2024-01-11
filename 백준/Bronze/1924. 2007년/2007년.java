import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int month = sc.nextInt();
        int day = sc.nextInt();
        int n =0;

        for (int i = 0; i < month; i++) {
            n += months[i];
        }

        n+= day-1;

        System.out.println(days[n%7]);

    }
}