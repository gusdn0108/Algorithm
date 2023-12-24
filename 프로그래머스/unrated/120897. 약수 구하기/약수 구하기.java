import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        // 약수 구하는법 n % i == 0
        // 주워진 값 % i만큼 돌려서 0이나오는 값들은 약수이다 ㅅ
        // n= 24
        // 1, 24
        // 2,12
        // 이런식으로
        List<Integer> tempList = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if( n % i == 0){
                tempList.add(i);
            }
        }
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }


        return answer;
    }
}