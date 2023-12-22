import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> tempList = new ArrayList<>();

        // Mystring => "hi12392"
        String s = my_string.replaceAll("[^0-9]", "");
        // "12392"
        String[] split = s.split("");

       // "1","2","3",'4";
        for (String s1 : split) {
            int i = Integer.parseInt(s1);
            tempList.add(i);
        }
        // [1,2,3,4]
        int[] answer = new int[tempList.size()];

        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
