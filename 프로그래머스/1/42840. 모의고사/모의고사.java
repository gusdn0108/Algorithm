import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        // answer = [1,2,3,4,5]
        int[][] testers = {
                {1, 2, 3, 4, 5}, //5
                {2, 1, 2, 3, 2, 4, 2, 5 }, // 8
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} // 10
        };

        int[] scores = {0,0,0};

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < testers.length; j++) {
                if(answers[i] == testers[j][i% testers[j].length] ){
                    scores[j]++;
                }
            }
        }

        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        List<Integer> topScores = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore){
                // 몇번째 사람인지 걸러줘야함 근데 테스트0번째라는 사람은 없으니깐 1번부터 시작
                topScores.add(i+1);

            }
        }


        answer = new int[topScores.size()];
        for (int i = 0; i < topScores.size(); i++) {
            answer[i] = topScores.get(i);
        }



        return answer;
    }
}