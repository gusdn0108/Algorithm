import java.util.Objects;

class Solution {
    public int solution(int order) {
        int answer = 0;

        // order => 29423 일때 answer => 3의 배수 3,6,9 마다 answer +1
        String[] orderArray = Integer.toString(order).split("");
        for (int i = 0; i < orderArray.length; i++) {
            if (Objects.equals(orderArray[i], "3") || Objects.equals(orderArray[i], "6") || Objects.equals(
                    orderArray[i],
                    "9")) {
                answer++;
            }
        }
        return answer;
    }
}