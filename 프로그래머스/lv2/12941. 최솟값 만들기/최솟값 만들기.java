import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        ArrayList<Integer> b = new ArrayList<>();           // 내림차순 정렬 시 사용할 ArrayList
        
        for(int i = 0; i < B.length; i++){
            b.add(B[i]);
        }
        
        Arrays.sort(A);                                     // 오름차순정렬
        Collections.sort(b, Collections.reverseOrder());    // 내림차순 정렬 
        
        for(int i = 0; i < A.length; i++){
            answer += A[i] * b.get(i);
        }

        return answer;
    }
}