import java.util.Arrays;
import java.util.Scanner;

public class arrayMenu {
    static int insertArray(int Arr[], int pos, int val, int index) {
        if(pos >= Arr.length || pos < 0) {
            System.out.println("Position not found!");
            return index;
        }

        if(index >= Arr.length) {
            System.out.println("Array is full! Insertion can't be done!");
            return index;
        }

        for(int i=index; i>=pos && i>0; i--) {
            Arr[i] = Arr[i-1];
        }
        
        Arr[pos-1] = val;

        if(index < Arr.length){
            index++;
        }

        return index;
    }

    static int deleteArray(int Arr[], int val, int index) {
        Arrays.sort(Arr);
        int i = Arrays.binarySearch(Arr, val);

        if(i == -1) {
            System.out.println("Element to be deleted not found in the array!");
            return index;
        }

        for(; i<index-1; i++) {
            Arr[i] = Arr[i+1];
        }

        index--;
        return index;
    }

    static void printArray(int Arr[], int index) {
        System.out.print("Array elements : ");
        for(int i=0; i<index; i++)  {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    static void searchArray(int Arr[], int val) {
        Arrays.sort(Arr);
        int index = Arrays.binarySearch(Arr, val);

        if(index == -1) {
            System.out.println("Value not found!");
        } else {
            System.out.println("Value found at position " + index);
        }
    }
    
    public static void main(String[] args) {
        int Arr[], choice=0, index=0, val, pos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        // size = sc.nextInt();
        Arr = new int[sc.nextInt()];

        while(choice != 6) {
            System.out.println("[1] Insert in array");
            System.out.println("[2] Delete from array");
            System.out.println("[3] Search in array");
            System.out.println("[4] Sort array");
            System.out.println("[5] Print array");
            System.out.println("[6] Exit array");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter the value for insertion : ");
                    val = sc.nextInt();
                    System.out.print("Enter the position for insertion : ");
                    pos = sc.nextInt();
                    index = insertArray(Arr, pos, val, index);
                    break;
                case 2:
                    System.out.print("Enter the value for deletion : ");
                    val = sc.nextInt();
                    index = deleteArray(Arr, val, index);
                    break;
                case 3:
                    System.out.print("Enter the value for searching : ");
                    val = sc.nextInt();
                    searchArray(Arr, val);
                    break;
                case 4:
                    Arrays.sort(Arr);
                    System.out.println("Array sorted!");
                    break;
                case 5:
                    printArray(Arr, index);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid input! Try again!");
            }
        }
    }
}