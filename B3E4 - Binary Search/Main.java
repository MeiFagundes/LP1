import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) {
        
        int temp;
        final int no = 21;
        int[] array = new int[100];
        int[] range = RandomizeArray(IntStream.rangeClosed(1, 150).toArray());

        for (int i = 0; i < array.length; i++) {
            array[i] = range[i];
        }

        Arrays.sort(array);
        //temp = Arrays.binarySearch(array, no);
        temp = BinarySearch(array, no);

        if (temp >= 0){
            System.out.println("-- Item '" + no + "' achado na posição " + temp + " --");
        }
        else
            System.out.println("-- Item não achado! --");
    }

    public static int BinarySearch(int[] sortedArray, int key) {
        int index = -1;
        int low = 0;
        int high = sortedArray.length - 1;
        
        while (low <= high) {
            
            int mid = (low + high) / 2;
            System.out.println("Posição " + mid + " procurada");
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int[] RandomizeArray(int[] array){
		Random rgen = new Random();  // Random number generator			
 
		for (int i=0; i<array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
 
		return array;
	}
}
