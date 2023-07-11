class Solution {
    public boolean isPalindrome(String s) {
        if( s.length() == 0){
            return true;
        }else{
            String temp ="";
            for(char c : s.toCharArray()){
                if(Character.isLetterOrDigit(c)){
                    c =Character.toLowerCase(c);
                    temp += c;    
                }
            }
            s = temp;
            String reversed = new StringBuilder(temp).reverse().toString();
            return s.equals(reversed);
        }
    }
}
