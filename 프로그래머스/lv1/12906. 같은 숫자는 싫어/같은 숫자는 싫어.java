import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        arrList.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                arrList.add(arr[i]);
            }
        }
        
        int[] answer = new int[arrList.size()];
        
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return answer;
    }
}