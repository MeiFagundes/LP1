public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        
        Operations.InsertPhraseIntoTree(bt, "abc cba bac");
        bt.printInOrder();
        bt.printPreOrder();
        bt.printPostOrder();
    }
}