import java.util.Arrays;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                int n = sc.nextInt();
                int[] scores = new int[2 * n];
                for (int i = 0; i < 2 * n; i++) {
                    scores[i] = sc.nextInt();
                }
                Arrays.sort(scores);
                int minTeamScore = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    int teamScore = scores[i] + scores[2 * n - 1 - i];
                    minTeamScore = Math.min(minTeamScore, teamScore);
                }
                System.out.println(minTeamScore);
                sc.close();
            }
        }
