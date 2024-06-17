import java.util.*;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        //List<List<String>> items = Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
//            Arrays.asList("computer", "silver", "phone"),
//             Arrays.asList("phone", "gold", "iphone"));
        // key의 기본 타입
        int searchType = 0;

        if(ruleKey.equals("color")){
            // key가 만약 color 일때
            searchType = 1;
        }

        if(ruleKey.equals("name")){
            // key가 만약 name일때
            searchType = 2;
        }


        int matches = 0;



        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(searchType).equals(ruleValue)){
                matches++;
            }
        }

        return matches;
    }
}
