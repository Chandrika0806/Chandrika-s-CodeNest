import java.util.Scanner;

// Node class represents a single node in the binary tree
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Binary Tree (BT) class with traversal methods
class BT {
    Node root;

    BT() {
        this.root = null;
    }

    // Method to insert a new node
    void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive method for insertion
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // Inorder Traversal: Left -> Root -> Right
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder Traversal: Root -> Left -> Right
    void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal: Left -> Right -> Root
    void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}

// Main class to test the binary tree and its traversals
public class BinaryTreeTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BT tree = new BT();

        System.out.println("Enter the number of nodes to insert:");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }

        System.out.println("\nInorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);

        scanner.close();
    }
}
