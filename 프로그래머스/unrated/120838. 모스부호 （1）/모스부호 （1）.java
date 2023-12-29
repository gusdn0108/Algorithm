class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        
        int ascii = 97;
        String[] alphabets = letter.split(" ");
        for (String alphabet : alphabets) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(alphabet)) {
                    answer += (char)(ascii + i);
                }
            }
        }

        return answer;
    }
}