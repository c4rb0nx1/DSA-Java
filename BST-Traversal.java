package LearningModule;

import java.util.Scanner;

class NodeTree {
    int value;
    NodeTree left;
    NodeTree right;

    // Constructor
    public NodeTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeOperations {
    NodeTree root;

    public BinaryTreeOperations(int rootValue) {
        this.root = new NodeTree(rootValue);
    }

    public void insert(int value) {
        root = insertValue(root, value);
    }

    private NodeTree insertValue(NodeTree current, int value) {
        if (current == null) {
            return new NodeTree(value);
        }

        if (value < current.value) {
            current.left = insertValue(current.left, value);
        } else {
            current.right = insertValue(current.right, value);
        }
        return current;
    }

    public void performInOrderTraversal() {
        inOrderTraversal(root);
    }

    public void performPreOrderTraversal() {
        preOrderTraversal(root);
    }

    public void performPostOrderTraversal() {
        postOrderTraversal(root);
    }

    private void inOrderTraversal(NodeTree current) {
        if (current != null) {
            inOrderTraversal(current.left);
            System.out.print(current.value + " ");
            inOrderTraversal(current.right);
        }
    }

    private void preOrderTraversal(NodeTree current) {
        if (current != null) {
            System.out.print(current.value + " ");
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }

    private void postOrderTraversal(NodeTree current) {
        if (current != null) {
            postOrderTraversal(current.left);
            postOrderTraversal(current.right);
            System.out.print(current.value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int rootValue = scanner.nextInt();
        BinaryTreeOperations binaryTree = new BinaryTreeOperations(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = scanner.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = scanner.nextInt();
            binaryTree.insert(nodeValue);
        }

        System.out.println("In-Order Traversal: ");
        binaryTree.performInOrderTraversal();

        System.out.println("\nPre-Order Traversal: ");
        binaryTree.performPreOrderTraversal();

        System.out.println("\nPost-Order Traversal: ");
        binaryTree.performPostOrderTraversal();

        scanner.close();
    }
}