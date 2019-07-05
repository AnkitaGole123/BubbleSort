package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
       List<Integer> bubble = Arrays.asList(2, 5, 7, 2, 10, 1);
        System.out.println(sort(bubble));
    }
    public static <T extends Comparable<T>> List<T> sort(List<T> elements) {
        List<T> copyElement = new ArrayList<>(elements);
        for (int i = 0; i < copyElement.size() -1; i++){
            for (int j = 0; j<copyElement.size() -i -1; j++){
                if (copyElement.get(j).compareTo(copyElement.get(j +1)) > 0){
                    Swap.getSwap(copyElement,j, j+1);
                }
            }
        }
        return copyElement;
    }
}
