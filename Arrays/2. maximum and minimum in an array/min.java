import java.util.*;

public class min{
    public static Scanner scn = new Scanner(System.in);

    public static void minElement(int[] arr) {
        int minEle = (int) 1e9;
        for (int ele : arr) {
            minEle = Math.min(minEle, ele);
        }
        System.out.println(minEle);

    }

    private static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input(n);
        minElement(arr);

    }
}
