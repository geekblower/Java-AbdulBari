import java.util.Arrays;

public class sortArrayOfStrings {
    public static void main(String[] args) {
        String str[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};

        System.out.print("Before sorting : ");
        for(String x : str) {
            System.out.print("[" + x + "] ");
        }
        System.out.println();

        Arrays.sort(str);

        System.out.print("After sorting : ");
        for(String x : str) {
            System.out.print("[" + x + "] ");
        }
        System.out.println();
    }
}
