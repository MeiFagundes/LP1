import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        String[] names3 = {"José", "João", "Amanda", "Manuel", "Maria", "Maria", "Gisele", "Penelope", "Gisele"};
        LinkedList list3 = new LinkedList();
        list3.InsertArraySequentiallyWithoutDuplicates(names3);
        list3.insertTail(new Data(new String("Isabela")));
        list3.insertTail(new Data(new String("Manuel")));

        String nameExample = "Maria";
        System.out.println("O nome '" + nameExample + "' está incluído na lista? -> " + list3.compareTo(nameExample));

        list3.print();
        list3.sort();
        list3.print();
        list3.remove(list3.getIndexOf("João"));
        list3.print();
    }
}