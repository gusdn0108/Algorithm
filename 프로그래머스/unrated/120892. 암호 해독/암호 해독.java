class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }

        return answer;
    }
}

// 다른 문제 풀이 방법

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] split = cipher.split("");

        for (int i = 0; i < split.length; i++) {
            if((i+1)% code ==0){
                answer += split[i];
            }
        }

        return answer;
    }
}
