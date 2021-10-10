import java.util.Scanner;

class SumOfArrays{

    public int n,m;

    public int[] array1;
    public int[] array2;

    public void input(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Length of the First Array : ");

        n = scan.nextInt();

        array1 = new int[n];

        System.out.println("Now Enter the Elements of the First Array : ");

        for(int i = 0;i<n;i++){
            array1[i] = scan.nextInt();
        }

        System.out.println("Enter the Length of the Second Array : ");

        m = scan.nextInt();

        array2 = new int[m];

        System.out.println("Now Enter the Elements of the Second Array : ");

        for(int i = 0;i<m;i++){
            array2[i] = scan.nextInt();
        }

        scan.close();
    }

       public static Scanner scn = new Scanner(System.in);

    public static void maxElement(int[] arr){
        int maxEle = -(int)1e9;
        for(int ele : arr){
             maxEle = Math.max(maxEle, ele);
        }
          System.out.println(maxEle);

    }
    private static int[] input(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        return arr;        
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input(n);
        maxElement(arr);
        
    
public class sum {
    public static void main(String[] args) {
        SumOfArrays sum = new SumOfArrays();

        sum.input();

        int[] resultArray = sum.ArraysSum();

        sum.printArray(resultArray);

    }
}
