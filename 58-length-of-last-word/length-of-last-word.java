class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        int i = s.length()-1;
        while( i>=0 &&s.charAt(i)==' '){
            i--;


        }
        for(int j=i ; j>=0; j--){
            if(s.charAt(j)==' '){
                break;
            } else { 
                count++;
            }

        }
        return count;
        
    }
}