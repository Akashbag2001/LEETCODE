class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            // for opening brackets
            if(ch== '(' || ch== '{' || ch== '['){
                s.push(ch);
            }else {
                if(s.isEmpty()){
                    return false;
                }
                // for closing brackets 
                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek()=='[' && ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
