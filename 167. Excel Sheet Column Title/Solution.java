class Solution {
    public String convertToTitle(int n) {
        String answer="";
        while( n > 0){
            int temp= n % 26;
            if(temp==0){
                answer="Z" + answer;
                n=n/26-1;
            }else{
                answer=new String(Character.toChars('A'+temp-1)) + answer;
                n/=26;
            }
        }
        return answer;
    }
}