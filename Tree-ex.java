package Study;
import java.util.Scanner;

class TreeNode2 {
    int data;
    TreeNode2 left;
    TreeNode2 right;

    // Constructor
    public TreeNode2(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Main class
public class Tree2 {
    TreeNode2 root;

    // 
    public Tree2(int rootData) {
        this.root = new TreeNode2(rootData);
    }

    // Method to initiate the insertion of a new node
    public void insert(int data) {
        root = insertValue(root, data);
    }

    // Recursive method to insert a value 
    private TreeNode2 insertValue(TreeNode2 root, int data) {
        if (root == null) {
            root = new TreeNode2(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertValue(root.left, data);
        } else if (data > root.data) {
            root.right = insertValue(root.right, data);
        }
        return root;
    }

    // inorder allocation
    public void performInOrderTraversal() {
        traverseInOrder(root);
    }

    // Recursive helper method for inorder traversal
    private void traverseInOrder(TreeNode2 root) {
        if (root != null) {
            traverseInOrder(root.left);
            System.out.print(root.data + " ");
            traverseInOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int rootValue = scanner.nextInt();
        Tree2 tree = new Tree2(rootValue);

        System.out.println("Enter the number of node values: ");
        int numNodes = scanner.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = scanner.nextInt();
            tree.insert(nodeValue);
        }

        System.out.println("InOrder Traversal: ");
        tree.performInOrderTraversal();
        scanner.close();
    }
}
