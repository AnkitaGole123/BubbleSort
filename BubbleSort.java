public class BubbleSort {
    public static void main(String[] args) {
        int[] bubble = {2, 5, 7, 2, 10, 1};
        bubbleSort(bubble);
        for (int i = 0; i <bubble.length; i++){
            System.out.println(bubble[i]);
        }
    }
    public static void bubbleSort(int[] bubbles) {
        int swap;
        for (int i = 0; i < bubbles.length; i++) {
            for (int j = 1; j < (bubbles.length - i); j++) {
                if (bubbles[j - 1] > bubbles[j]) {
                    swap = bubbles[j - 1];
                    bubbles[j - 1] = bubbles[j];
                    bubbles[j] = swap;
                }
            }
        }
    }
}
