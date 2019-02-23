public class Operations {

    public static void InsertPhraseIntoTree(BinaryTree bt, String phrase) {
        String[] words = phrase.split(" ");
        for (int i = 0; i < words.length; i++) {
            bt.add(words[i]);
        }
    }
}