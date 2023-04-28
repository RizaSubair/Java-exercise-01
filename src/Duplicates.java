// I certify the code of this lab is entirely my own work,
// Follow this with a description of the type of assistance (https://www.codejava.net/java-core/collections/java-list-collection-tutorial-and-examples).

import java.util.List;
public class Duplicates{
    private static <T> void findDuplicates(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j<array.length; j++){
                if (array[i].equals(array[j])){
                    System.out.println("Duplicates found: " + array[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2, 5, 7, 3, 1, 5, 2);
        Object [] arr1 = list1.toArray();
        findDuplicates(arr1);

        List<String> list2 = List.of("ab","bc","ab");
        Object [] arr2 = list2.toArray();
        findDuplicates(arr2);
    }
}

