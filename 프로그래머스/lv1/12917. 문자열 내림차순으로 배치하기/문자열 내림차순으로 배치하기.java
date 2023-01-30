import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] st = s.split("");
        
        Arrays.sort(st, Collections.reverseOrder());
        answer = String.join("", st); // split() <-> 문자열 배열을 ""를 기준으로 String 형으로
        
        
        return answer;
    }
}