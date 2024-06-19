import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[][] stringArr = new String[n][2];

        for (int i = 0; i < n; i++) {
            stringArr[i][0] = sc.next(); // Read the age
            stringArr[i][1] = sc.next(); // Read the name
        }

        Arrays.sort(stringArr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(stringArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
