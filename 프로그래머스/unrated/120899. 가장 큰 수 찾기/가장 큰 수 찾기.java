class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int [2];
        // 1,8,3
        // array[0] => 1  answer[0] =>0  1>0
        // array[1] => 8 answer[0] => 0 8>0
        // answer[0] =>1
        // answer[0] => 8
        for (int i = 0; i < array.length; i++) {
            if(array[i]> answer[0]){
                answer[0] = array[i];
                answer[1]= i;
            }
        }
        return answer;
    }
}
