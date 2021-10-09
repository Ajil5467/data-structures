public class substract {
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
