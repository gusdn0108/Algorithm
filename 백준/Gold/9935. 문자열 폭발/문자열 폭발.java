import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 시간초과 왜 나는지 몰라서 chatgpt한태 물어봄 stringBuilder 다시봐야함 
        Scanner sc = new Scanner(System.in);
        String bombString = sc.next();
        String exitCode = sc.next();
        int cnt = exitCode.length();

        String fail = "FRULA";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < bombString.length(); i++) {
            sb.append(bombString.charAt(i));
            if (sb.length() >= cnt) {
                boolean flag = true;
                for (int j = 0; j < cnt; j++) {
                    if (sb.charAt(sb.length() - cnt + j) != exitCode.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sb.setLength(sb.length() - cnt);
                }
            }
        }

        if (sb.length() == 0) {
            System.out.println(fail);
        } else {
            System.out.println(sb.toString());
        }
    }
}
