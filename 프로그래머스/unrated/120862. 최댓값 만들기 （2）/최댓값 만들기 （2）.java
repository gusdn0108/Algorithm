import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // numbers => [1, 2, -3, 4, -5]
        Arrays.sort(numbers);
        answer = Math.max(numbers[0]*numbers[1],numbers[numbers.length-1]*numbers[numbers.length-2]);
        return answer;
    }
}
