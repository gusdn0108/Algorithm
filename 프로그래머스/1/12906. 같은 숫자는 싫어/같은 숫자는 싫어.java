import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        // arr => [1,1,3,3,0,1,1]
        // answer => [1,3,0,1]
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // isempty 랑 empty 차이
            // isempty 는 인터페이스가 collection으로 반환하는건가
            // empty 는 stack으로 반환함
            if(!stack.empty()){
                if(stack.peek() != arr[i]){
                    stack.push(arr[i]);
                }
            }else {
                stack.push(arr[i]);
            }
        }


        int[] answer =new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        
        return answer;
    }
}