import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        /**
         *
         * [
         * [60, 50], j j+1
         * [30, 70],
         * [60, 30], 
         * [80, 40]
         * ]
         *
         */

        // 항상 긴 변은 가로
        int answer = 0;
        // 가로는 항상 최대값
        // 세로는 최대값 의 이전값 <<
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length-1; j++) {
                if(sizes[i][j] < sizes[i][j+1]){
                    int change = sizes[i][j+1];
                    int before = sizes[i][j];
                    sizes[i][j] = change;
                    sizes[i][j+1]= before;
                }
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                System.out.print(sizes[i][j] + " ");
            }
            System.out.println();
        }
        // 가로 max값


        int maxWidth = 0;
        int maxHeight = 0;


        for (int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];

            if (width > maxWidth) {
                maxWidth = width;
            }
            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        answer = maxWidth * maxHeight;

        return answer;
        
        
    }
}