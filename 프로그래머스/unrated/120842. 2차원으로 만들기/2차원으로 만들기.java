class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;
        // num_list => [1, 2, 3, 4, 5, 6, 7, 8] 길이가 8
        // n = 2
        // 행 구하는 공식 num_list.length / n  행 은 가로
        // 열 n  열은 세로
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }
}