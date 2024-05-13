public class bubbleSort {
    public static void main(String[] args){
        int[] alphabets = new int[26];
        alphabets[0] = a;
    
        for (int i = 1; i < alphabets.length; i++) {
            alphabets[i] = alphabets[i-1]++;
        }

        bubbleSort(alphabets);
    }

    static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i>=0; i--) {
            for (int j = 0; j < i ; j++) {
                array[j] = array[j] ^ array[j + 1];
                array[j + 1] = array[j] ^ array[j + 1];
                array[j] = array[j] ^ array[j + 1];
            }
        }
    }
}