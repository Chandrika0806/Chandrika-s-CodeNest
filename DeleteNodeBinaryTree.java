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

// BinaryTree class with deletion logic
class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to delete a node in the binary tree
    public void deleteNode(int key) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        if (root.left == null && root.right == null) {
            if (root.data == key) {
                root = null;
            } else {
                System.out.println("Key not found.");
            }
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node keyNode = null;
        Node temp = null;

        // Perform level-order traversal to find the node to delete and the last node
        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.data == key) {
                keyNode = temp;
            }

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        if (keyNode != null) {
            int x = temp.data; // Save the data of the deepest rightmost node
            deleteDeepest(temp); // Delete the deepest rightmost node
            keyNode.data = x; // Replace the key node's data with the deepest node's data
        } else {
            System.out.println("Key not found.");
        }
    }

    // Method to delete the deepest rightmost node
    private void deleteDeepest(Node delNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node temp = null;

        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp == delNode) {
                temp = null;
                return;
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else {
                    queue.add(temp.left);
                }
            }

            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    queue.add(temp.right);
                }
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

// Main class to demonstrate node deletion
public class DeleteNodeBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Build the tree
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.right = new Node(40);

        System.out.println("Inorder traversal before deletion:");
        tree.inorderTraversal(tree.root);

        // Delete a node
        System.out.println("\n\nDeleting node 20...");
        tree.deleteNode(20);

        System.out.println("Inorder traversal after deletion:");
        tree.inorderTraversal(tree.root);
    }
}
