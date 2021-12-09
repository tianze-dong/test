import java.util.ArrayList;

public class LeafCollector {
    ArrayList<String> list = new ArrayList<>();
    public String[] getLeaves(TreeNode tree) {
        ArrayList<String> round = new ArrayList<>();
        while (tree != null) {
            round.clear();
            tree = removeLeaf(tree, round);
            String s = String.join(" ", round);
            list.add(s);
        }
        return list.toArray(new String[0]);
    }
    private TreeNode removeLeaf(TreeNode tree, ArrayList<String> list) {
        if (tree == null) {
            return null;
        }
        if (tree.left == null & tree.right == null) {
            list.add(""+tree.info);
            return null;
        }
        tree.left = removeLeaf(tree.left, list);
        tree.right = removeLeaf(tree.right, list);
        return tree;
    }
}