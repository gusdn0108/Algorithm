import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aiueo]","");
        return answer;
    }
}