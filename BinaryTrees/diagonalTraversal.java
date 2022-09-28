class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
          ArrayList<Integer> ans = new ArrayList<>();
          Queue<Node> mq = new ArrayDeque<>();
          mq.add(root);
          while(mq.size() > 0){
              Node rem = mq.remove();
              while(rem != null){
                  if(rem.left != null){
                    mq.add(rem.left);
                }
                ans.add(rem.data);
                  rem = rem.right;
              }
          }
          return ans;
      }
}