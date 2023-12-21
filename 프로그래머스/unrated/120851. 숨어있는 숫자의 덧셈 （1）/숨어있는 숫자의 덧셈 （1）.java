import java.util.Arrays;

class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        String numberString = my_string.replaceAll("[^0-9]", "");
        String[] split = numberString.split("");
        for (int i = 0; i < split.length; i++) {
            int stringNum = Integer.parseInt(split[i]);
            answer += stringNum;
        }
        return answer;
    }
}