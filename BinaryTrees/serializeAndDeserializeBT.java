public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        System.out.print(sb);
        return sb.toString();
    }
    
    private void serializeHelper(TreeNode node, StringBuilder sb){
        if(node == null){
            sb.append("null ");
            return;
        }
        sb.append(node.val+" ");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String input[] = data.split(" ");
        this.idx = 0;
        return deserializeHelper(input);
    }
    
    static int idx=0;
    
    private TreeNode deserializeHelper(String input[]){
        if(idx == input.length){
            return null;
        }
        if(input[idx].equals("null")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(input[idx]));
        idx++;
        node.left = deserializeHelper(input);
        idx++;
        node.right = deserializeHelper(input);
        return node;
    }
}
