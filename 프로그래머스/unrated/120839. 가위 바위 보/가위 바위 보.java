import java.util.Objects;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arrayRsp = rsp.split("");
        // rsp => 2(가위) 그럼 return 0(주먹)
        // rsp => 205 가위바위보를 냈어 그럼 052
        for (int i = 0; i < arrayRsp.length; i++) {
            if(Objects.equals(arrayRsp[i], "2")){
                answer += "0";
            } else if (Objects.equals(arrayRsp[i], "0")) {
                answer += "5";
            } else if (Objects.equals(arrayRsp[i], "5")) {
                answer += "2";
            }
        }

        return answer;
    }

}
