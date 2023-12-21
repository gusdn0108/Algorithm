class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isUpperCase(charArray[i])){
                answer += Character.toLowerCase(charArray[i]);
            }
            if(Character.isLowerCase(charArray[i])){
                answer += Character.toUpperCase(charArray[i]);
            }
        }
        return answer;
    }
}
