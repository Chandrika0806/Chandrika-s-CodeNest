import java.util.LinkedList;
import java.util.Queue;

// Node class for the binary tree
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// BinaryTree class with level-order insertion
class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to insert a key in level order
    public void insert(int key) {
        Node newNode = new Node(key);

        // If the tree is empty, set the new node as the root
        if (root == null) {
            root = newNode;
            return;
        }

        // Level-order traversal using a queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // If the left child is empty, insert the new node there
            if (current.left == null) {
                current.left = newNode;
                return;
            } else {
                queue.add(current.left);
            }

            // If the right child is empty, insert the new node there
            if (current.right == null) {
                current.right = newNode;
                return;
            } else {
                queue.add(current.right);
            }
        }
    }

    // Inorder traversal to display the tree
    public void inorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
}

// Main class to demonstrate the insertion
public class InsertInBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Building the tree
        tree.root = new Node(10);
        tree.root.left = new Node(11);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(7);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(8);

        System.out.println("Inorder traversal before insertion:");
        tree.inorderTraversal(tree.root); // Output: 7 11 10 15 9 8

        // Inserting a new key into the binary tree
        int key = 12;
        tree.insert(key);

        System.out.println("\nInorder traversal after insertion:");
        tree.inorderTraversal(tree.root); // Output: 7 11 10 12 15 9 8
    }
}
