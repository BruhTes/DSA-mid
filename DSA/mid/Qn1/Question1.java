import java.util.Scanner;
public class Question1 {
   public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amout of numbers: ");

        int amt = keyboard.nextInt();
        int [] array = new int[amt];
        for (int i = 0; i < amt; i++) {
            System.out.println("Enter a Number:");
            array[i] = keyboard.nextInt();
        }

        System.out.println("Enter the number you need to be searched: ");
        int numToSearch = keyboard.nextInt();
        
        int x = LinearSearcher(array, numToSearch)
        if (x == -1) {
            System.out.println("Number not in array");
        } else {
            System.out.println("The number is present at index: " + x);
        }

        int occurence = Occurences(array, numToSearch);
        System.out.println("Occurence: " + occurence);
   } 

   static int LinearSearcher(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
   }

   static int Occurences(int[] arr, int num){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                count ++;
            }
        }
        return count;
   }
}