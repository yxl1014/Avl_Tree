package AVL;

public class Avltree{
    private TreeNode node;
    public Avltree(){}
    public int treehigh(TreeNode node) {
        int left = node.leftnode == null ? -1 : node.leftnode.high;
        int right = node.rightnode == null ? -1 : node.rightnode.high;
        return Math.max(left, right) + 1;
    }

}








