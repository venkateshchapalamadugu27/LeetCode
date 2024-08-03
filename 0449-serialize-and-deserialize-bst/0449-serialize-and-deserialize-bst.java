/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    StringBuilder serStr = new StringBuilder();
    String s="";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        helper(root);
        return serStr.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
         String[] nodes = data.split(",");
        List<String> nodeList = new ArrayList<>(Arrays.asList(nodes));
        return helper2(nodeList);
    }

    void helper(TreeNode node){
        if (node == null) {
            serStr.append("null,");
            return;
        }
        
        serStr.append(node.val).append(",");
        helper(node.left);
        helper(node.right);
    }

    TreeNode helper2(List<String> list){
        String v = list.remove(0);

        if (v.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(v));
        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));