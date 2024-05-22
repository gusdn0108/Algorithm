import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {

    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(stack.peek() == arr[i]){
                continue;
            }else {
                stack.push(arr[i]);
            }
        }

        answer = new int[stack.size()];

        for (int i = stack.size()-1; i >=0 ; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
