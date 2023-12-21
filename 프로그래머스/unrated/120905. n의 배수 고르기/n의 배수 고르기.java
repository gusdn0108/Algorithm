import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i : numlist) {
            if(i % n == 0){
                arrayList.add(i);
            }
        }
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
