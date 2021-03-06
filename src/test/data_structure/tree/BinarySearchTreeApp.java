package data_structure.tree;

public class BinarySearchTreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(6, 6);//插入操作,构造图一所示的二叉树

        tree.insert(3, 3);

        tree.insert(14, 14);

        tree.insert(16, 16);

        tree.insert(10, 10);

        tree.insert(9, 9);

        tree.insert(13, 13);

        tree.insert(11, 11);

        tree.insert(12, 12);

        System.out.println("删除前遍历结果");

        tree.inOrder(tree.root);//中序遍历操作

        System.out.println("删除节点10之后遍历结果");

        tree.delete(10);//删除操作

        tree.inOrder(tree.root);

    }

}