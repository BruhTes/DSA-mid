public class Deletion {
    public static void main(String[] args){
        int[] array = {3,7,1,9,4};

        int[] newArray = deleteElement(array, 7); 
    }

    static int[] deleteElement (int[] arr, int index) {

        if (index < 0 || >= arr.length){
            System.out.println("Invalid index.");
            return arr
        } else {
            for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr;
        }
    }
}