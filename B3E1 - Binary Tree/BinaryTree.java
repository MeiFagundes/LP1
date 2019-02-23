public class BinaryTree {
 
    Node root;
 
    public void add(String value) {
        addRecursive(root, value);
    }

    private Node addRecursive(Node current, String value) {
        if (current == null) {
            return new Node(value);
        }
        
        if (value.compareTo(current.value) < 0) {
            current.left = addRecursive(current.left, value);
        } else if (value.compareTo(current.value) > 0) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
    }

    public boolean containsNode(String value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, String value) {
        if (current == null) {
            return false;
        } 
        if (value == current.value) {
            return true;
        } 
        return value.compareTo(current.value) < 0
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }

    private Node deleteRecursive(Node current, String value) {
        if (current == null) {
            return null;
        }
     
        if (value == current.value) {
            // Node to delete found

            // Node has no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Node has one child
            if (current.right == null & current.left != null) {
                return current.left;
            }
             
            if (current.left == null & current.right != null) {
                return current.right;
            }

            // Node has two children
            String smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        } 
        if (value.compareTo(current.value) < 0) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void delete(String value) {
        deleteRecursive(root, value);
    }

    private String findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public void traverseInOrder(Node node) {
        
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.value);
        }
    }

    public void printInOrder(){
        traverseInOrder(root);
        System.out.print("\n");
    }

    public void printPreOrder(){
        traversePreOrder(root);
        System.out.print("\n");
    }

    public void printPostOrder(){
        traversePostOrder(root);
        System.out.print("\n");
    }

}