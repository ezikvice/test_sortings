import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: dmitry
 * Date: 01.03.12
 * Time: 16:41
 * To change this template use File | Settings | File Templates.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        final int ARR_LENGTH = 100;
        int[] intArray = new int[ARR_LENGTH];
        for(int i = 0; i< ARR_LENGTH; i++){

            Random rnd = new Random();
            intArray[i] = rnd.nextInt(1000);
           System.out.printf(intArray[i]+ "  ");
        }

        System.out.println();
        System.out.println("Длина " + intArray.length);

        Sorter sort = new SimpleSorter();
        sort.sort(intArray);
        System.out.println();

        Sorter qsort = new QuickSorter();
        qsort.sort(intArray);

    }

}
