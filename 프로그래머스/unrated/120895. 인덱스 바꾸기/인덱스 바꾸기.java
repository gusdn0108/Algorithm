class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        // mystring => "hello"
        // num1 교체할 첫번째값 1 e
        // num2 교체할 두번째값 2 l
        // "hlelo"

        String[] split = my_string.split("");
        // h,e,l,l,o
        String temp = split[num1];
        // temp => e
        split[num1] = split[num2];
        // spilt[num1] 은 e 에서 l 바뀜
        split[num2] = temp;
        // split[num2] 는 l에서 temp 에서 저장해둔 e 로바뀜
        return String.join("",split);
        // 이후 split 으로 자른 값을 다시 join("")으로 묶어줌
    }
}
