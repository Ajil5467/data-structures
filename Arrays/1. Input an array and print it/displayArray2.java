
import java.util.*;
public class displayArray2 {
    public static Scanner scn = new Scanner(System.in);

    public static void display2(int[] arr) {
        for (int ele : arr) {
            System.out.println(ele + "");
        }
    }

    public static int[] input2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        
        int[] arr = input2(n);
        display2(arr);
    }
}
