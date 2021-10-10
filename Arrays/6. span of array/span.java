
import java.util.*;

public class inverse {
  public static Scanner scn = new Scanner(System.in);

  public static void inverseArray(int[] arr) {
    int maxEle = -(int)1e9;
    int minEle = (int)1e9;
    for (int ele : arr) {
      maxEle = Math.max(maxEle, ele);
      minEle = Math.min(minEle, ele);
    }
    return maxEle - minEle;
  }

  public static void main(String[] args) {}
}

public static Scanner scn = new Scanner(System.in);

public static void maxElement(int[] arr) {
  int maxEle = -(int)1e9;
  for (int ele : arr) {
    maxEle = Math.max(maxEle, ele);
  }
  System.out.println(maxEle);
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
  maxElement(arr);
