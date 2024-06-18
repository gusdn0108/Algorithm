import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      char[][] map = new char[n][n];
        for (int i = 0; i < n ; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        int horizontal =0;
        int vertical =0;


        for (int i = 0; i < n; i++) {
                int checkWidth = 0;
                int checkHight = 0;
            for (int j = 0; j < n; j++) {
                if(map[i][j]== '.'){
                    checkWidth++;
                }
                // 누울수 없는 조건은 x가 있거나 .
                // 공간이 2개 이상 이여야함.
                // j == n-1
                if(map[i][j] == 'X' || j == n-1 ){
                    if(checkWidth >= 2){
                       horizontal++;
                    }
                    checkWidth = 0;
                }

                if(map[j][i] == '.'){
                    checkHight++;
                }

                if(map[j][i] =='X' || j == n-1){
                    if(checkHight >= 2){
                        vertical++;;
                    }
                    checkHight = 0;
                }
            }
        }

        System.out.println(horizontal + " " + vertical);
    }
}