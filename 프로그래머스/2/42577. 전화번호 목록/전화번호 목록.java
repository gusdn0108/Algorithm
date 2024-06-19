import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        // phone_book => "119", "97674223", "1195524421"
        // 구조대 : 119 , 박준영 : 97674223 지영석 : 1195524421
        // 이럴경우 false 를 반환함 접두어라는 소리임 접두어가 아니라면 true 반환
        // 위에 조건으롭면 구조대의 번호가 지영석이 접두어가 될수있음
        // 중복 x

        HashMap<String,Integer> phoneBookMap = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            phoneBookMap.put(phone_book[i],i);
        }

        // {97674223=1, 1195524421=2, 119=0}

        // map 안에 119 or 976 or 119

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                // map 안에 119,1195524421,97674223 이렇게 있을거임
                // 여기서 119가 11955- 의 접두어가 된걸 알수있음
                // 배열돌려서 119가 있는지 확인해주면됨
                if(phoneBookMap.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return true;
    }
}