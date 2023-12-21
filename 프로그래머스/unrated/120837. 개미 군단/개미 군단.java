class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] antDmg = {5,3,1};

        for (int i = 0; i < antDmg.length; i++) {
            answer += hp/antDmg[i];
            hp %= antDmg[i];
        }
        return answer;
    }
}
