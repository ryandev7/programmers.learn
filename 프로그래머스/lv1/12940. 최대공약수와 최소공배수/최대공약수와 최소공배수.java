class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int big = Math.max(n, m); 
        int small = Math.min(n, m);
        
        answer[0] = gcd(big, small);      // 최대공약수
        answer[1] = n * m / answer[0];    // 최소공배수
    
        return answer;
    }
    static int gcd(int a, int b){ // 큰값과 작은값으로 최대공약수 구하는 메소드 생성(유클리드 호제법)
        
        if(a % b == 0){
            return b;
        } else{
            return gcd(b, a%b);
        }
    }
}