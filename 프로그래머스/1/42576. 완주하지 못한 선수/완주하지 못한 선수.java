
// 1 for문으로 품
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}

// 2 HashMap공부하면서 품


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;


class Solution {
   public String solution(String[] participant, String[] completion) {
       String answer = "";
       // participant 경기자 completion 완주자
       // 동명이인이 있음
       // 완주 못한 사람 찾아야함.
       // 경기자에서 완주자가 있는지 찾아봐야함
       HashMap<String,Integer> participantMap = new HashMap<>();
       //        String[] participant = new String[]{"leo", "kiki", "eden"};
       //        String[] completion = new String[]{"eden", "kiki"};
       int counter = 0;
       for (String s : participant) {
           // map.getOrDefault로 map값안에 s가 없을경우에는 +1을 해줌
           // +1은 0 + 1 을 해주기위해서 쓴게아니라 foreach를 돌면서 +1 해줄꺼임
           participantMap.put(s, participantMap.getOrDefault(s,counter)+1);
       }


       for (String s : completion) {
           // 완주자를 돌면서 키값이 있으면 value값을 -1 시켜줄거임
           participantMap.put(s,participantMap.get(s)-1);
       }


       for (String s : participantMap.keySet()) {
           if(participantMap.get(s) != 0){
            answer = s;
            break;
           }
       }


       return answer;
   }
}
