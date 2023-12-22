class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        // mystring => "hello"
        // num1 교체할 첫번째값 1 e
        // num2 교체할 두번째값 2 l
        // "hlelo"

        String[] split = my_string.split("");
        String temp = split[num1];
        split[num1] = split[num2];
        split[num2] = temp;
        return String.join("",split);
    }
}
