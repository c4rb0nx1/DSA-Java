import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    // Constructor for initializing the root 
    public BinaryTree(int rootData) {
        this.root = new TreeNode(rootData);
    }

    // inserting a new node 
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // Recursive method for inserting a value
    private TreeNode insertVal(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else if (data > root.data) {
            root.right = insertVal(root.right, data);
        }

        return root;
    }

    // inorder traversal starting 
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    // Recursive inorder traversal
    private void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int rootValue = sc.nextInt();
        BinaryTree tree = new BinaryTree(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = sc.nextInt();
            tree.insert(nodeValue);
        }

        System.out.println("Inorder Traversal: ");
        tree.inorderTraversal();

        sc.close();
    }
}
