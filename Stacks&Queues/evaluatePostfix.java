class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int v1 = 0, v2 = 0;
        for(String s : tokens){
           switch(s){
                   
               case "+" :
                  v1 = st.pop();
                  v2 = st.pop();
                   st.push(v1+v2);
                   break;
               case "-" :
                   v1 = st.pop();
                  v2 = st.pop();
                   st.push(v2-v1);
                   break;
               case "*" :
                  v1 = st.pop();
                  v2 = st.pop();
                   st.push(v1*v2);
                   break;
               case "/" :
                  v1 = st.pop();
                  v2 = st.pop();
                   st.push(v2/v1);
                   break;
               default: st.push(Integer.parseInt(s));
           }
        }
        return st.pop();
    }
}