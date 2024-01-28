package LearningModule;

import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;
    public BinaryTree(int rootValue) {
        this.root = new Node(rootValue);
    }
    public void insert(int value) {
        root = insertValue(root, value);
    }
    private Node insertValue(Node current, int value) {
        if (current == null) {
            return new Node(value);
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
    private void inOrderTraversal(Node current) {
        if (current != null) {
            inOrderTraversal(current.left);
            System.out.print(current.value + " ");
            inOrderTraversal(current.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int rootValue = scanner.nextInt();
        BinaryTree binaryTree = new BinaryTree(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = scanner.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = scanner.nextInt();
            binaryTree.insert(nodeValue);
        }

        System.out.println("In-Order Traversal: ");
        binaryTree.performInOrderTraversal();

        scanner.close();
    }
}
