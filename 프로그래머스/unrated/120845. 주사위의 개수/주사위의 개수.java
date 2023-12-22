class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;

        // int[] box = [10,8,7] 가로 세로 높이 
        // n => 모서리 길이
        // 가로 세로 높이를 모서리 만큼 나눈다음 가로*세로*높이 해주면됨 ..
        int row = box[0] / n;
        int colum = box[1] /n;
        int height = box[2] /n;

        answer = row*colum*height;
        return answer;
    }
}
