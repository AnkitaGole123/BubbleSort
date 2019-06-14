public class Sort {
    public void bubbleSort(int[] bubbles) {
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
