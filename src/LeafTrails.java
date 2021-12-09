import java.util.*;

public class LeafTrails {
    public Map<Integer, String> map = new TreeMap<>();
    public String[] trails(TreeNode tree) {
        traverse(tree, "");
        List<Integer> keys = new ArrayList<>(map.keySet());
        String[] ret = new String[keys.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = map.get(keys.get(i));
        }
        return ret;
    }
    private void traverse(TreeNode tree, String path) {
        if (tree == null) {
            return;
        }
        if (tree.left == null & tree.right == null) {
            map.put(tree.info, path);
            return;
        }
        traverse(tree.left, path + "0");
        traverse(tree.right, path + "1");
    }
}