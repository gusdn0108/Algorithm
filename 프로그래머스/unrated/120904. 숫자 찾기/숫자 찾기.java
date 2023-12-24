import java.util.Arrays;
import java.util.Objects;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] stringNum = Integer.toString(num).split("");
        // 29183 => [2,9,1,8,3]

        for (int i = 0; i < stringNum.length; i++) {
            if(Objects.equals(stringNum[i], Integer.toString(k))){
                return i+1;
            }
        }

        return -1;
    }
}