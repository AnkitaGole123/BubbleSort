public class BubbleSort {
    public static void main(String[] args) {
        int[] bubble = {2, 5, 7, 2, 10, 1};
        Sort bubbleSort = new Sort();
        bubbleSort.bubbleSort(bubble);
        for (int i = 0; i <bubble.length; i++){
            System.out.println(bubble[i]);
        }
    }
}
