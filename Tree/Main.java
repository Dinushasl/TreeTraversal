package Tree;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    Node root;

    // In-order traversal
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left); // Traverse the left subtree
        System.out.print(node.data + " "); // Visit the root node
        inOrder(node.right); // Traverse the right subtree
    }

    // Pre-order traversal
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " "); // Visit the root node
        preOrder(node.left); // Traverse the left subtree
        preOrder(node.right); // Traverse the right subtree
    }

    // Post-order traversal
    void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left); // Traverse the left subtree
        postOrder(node.right); // Traverse the right subtree
        System.out.print(node.data + " "); // Visit the root node
    }
}


public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-order traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nPre-order traversal:");
        tree.preOrder(tree.root);

        System.out.println("\nPost-order traversal:");
        tree.postOrder(tree.root);
    }
}

