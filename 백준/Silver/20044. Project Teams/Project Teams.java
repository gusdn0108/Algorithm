import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 팀수 => n
        int n = sc.nextInt();

        // 학생 수 2N
        int[] MEMBER = new int[n * 2];

        // menber [] => 4자리수 배열
        String TEAM_SCORE = sc.next();

        String[] split = TEAM_SCORE.split("");
        for (int i = 0; i < 2 * n; i++) {
            int parseInt = Integer.parseInt(split[i]);
            MEMBER[i] = parseInt;
        }

        Arrays.sort(MEMBER);

        int min = 200000;
        for(int i = 0; i < 2 * n; i++) {
            int teamScore = MEMBER[i] + MEMBER[n * 2 - 1 - i];
            if(teamScore < min) {
                min = teamScore;
            }
        }

        System.out.println(min);
    }
}
