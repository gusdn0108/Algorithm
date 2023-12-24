class Solution {
    public String solution(int age) {
        String answer = "";
        String[] array = String.valueOf(age).split("");
        String ageString = "abcdefghij";
        // a=0 b =1 c=2 d=3 e=4 f=5 g=6 h=7 i=8 j=9
        // age = 24 answer = ce
        for (int i = 0; i < array.length; i++) {
            answer += ageString.charAt(Integer.parseInt(array[i]));
            // 답 = ageString.charAt(array 배열 숫자 )
            // abcdefghij중에 array의 배열은 [2,3] array0번째는 2니깐 ageString 의 2번째 즉 c가나옴
        }
        return answer;
    }
}