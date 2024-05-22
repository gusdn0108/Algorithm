import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public int[] solution(int[] arr) {
        int[] answer = {};

        int value = -1;
        int n = 1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i]){
                arr[i-1] = value;
            }else {
                n++;
            }
        }

        int[] array = new int[n];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != value){
                array[cnt++] = arr[i];
            }
        }
        


        answer = array;

        return answer;
    }
}


