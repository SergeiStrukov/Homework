package org.Classwork30_04_24;

public class BNode {
    public Integer value;
    public BNode left;
    public BNode right;

    private static boolean isNodeExist(BNode bNode) {

        return bNode != null && bNode.value != null;
    }

    private static void createNode(BNode bNode, int value) {
        bNode.left = new BNode();
        bNode.right = new BNode();
        bNode.value = value;
    }

    private static void insert(BNode bNode, int value) {
        if (!isNodeExist(bNode)) {
            createNode(bNode, value);
        } else if (value < bNode.value) {
            insert(bNode.left, value);
        } else {
            insert(bNode.right, value);
        }
    }

    private static BNode search(BNode bNode, int value) {
        if (!isNodeExist(bNode)) {
            return null;
        }

        if (bNode.value == value) {
            return bNode;
        }

        if (value < bNode.value) {
            return search(bNode.left, value);
        }

        return search(bNode.right, value);
    }

    //todo
    private static BNode getMin(BNode bNode) {
        if (!isNodeExist(bNode)) {
            return null;
        }
        if (bNode.left != null) {
            return getMin(bNode.left);
        }
        return bNode;
    }

    //todo
    private static BNode getMax(BNode bNode) {
        if (!isNodeExist(bNode)) {
            return null;
        }
        if (bNode.right != null) {
            return getMax(bNode.right);
        }
        return bNode;
    }

    //sort todo
    private static void inOrderTraversal(BNode bNode) {
//        левый поддерево -> текущий узел -> правый поддерево.
        if (!isNodeExist(bNode)) {
            return;
        }
        inOrderTraversal(bNode.left);
        System.out.println(bNode.value);
        inOrderTraversal(bNode.right);
    }

    //del todo
    private static void postOrderTraversal(BNode bNode) {
//        левое поддерево -> правое поддерево -> текущий узел.
        if (!isNodeExist(bNode)) {
            return;
        }
        postOrderTraversal(bNode.left);
        postOrderTraversal(bNode.right);
        System.out.println(bNode.value);
    }

    //copy
    private static void directOrderTraversal(BNode bNode) {
        if (!isNodeExist(bNode)) {
            return;
        }

        System.out.println(bNode.value);
        directOrderTraversal(bNode.left);
        directOrderTraversal(bNode.right);
    }

    //todo
    private static int getChildCount(BNode bNode) {
        if (!isNodeExist(bNode)) {
            return 0;
        }
        int leftChildCount = getChildCount(bNode.left);
        int rightChildCount = getChildCount(bNode.right);

        return leftChildCount + rightChildCount + 1;
    }

    public static void main(String[] args) {
        Integer[] digit = {2, 5, 13, 6, 10, 14};
        BNode bNode = new BNode();
        createNode(bNode, 7);
        postOrderTraversal(bNode);
    }
}