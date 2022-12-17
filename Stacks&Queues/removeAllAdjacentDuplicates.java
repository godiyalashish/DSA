class Solution {
    class Pair{
        char c;
        int count;
        Pair(char c, int count){
            this.c = c;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.size() > 0 && st.peek().c == ch){
                st.peek().count += 1;
            }else{
                st.push(new Pair(s.charAt(i), 1));
            }
            if(st.peek().count == k){
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            Pair p = st.pop();
            char ch = p.c;
            int count = p.count;
            for(int i=0; i<count; i++){
                sb.append(ch);
            }
        }
        sb.reverse();
        return sb.toString();
    }
}