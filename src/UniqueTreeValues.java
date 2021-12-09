import java.util.*;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        Set<Integer> set = new TreeSet<>();
        traverse(root, set);
        Integer[] arr = set.toArray(new Integer[0]);
        int[] ret = new int[arr.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }
    private void traverse(TreeNode root, Set<Integer> set) {
        if (root == null) return;
        set.add(root.info);
        traverse(root.left, set);
        traverse(root.right, set);
    }
}