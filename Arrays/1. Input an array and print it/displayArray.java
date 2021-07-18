import java.util.*;

public class displayArray{
    public static Scanner scn = new Scanner(System.in);
    //get
    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
         System.out.println(arr[i] + "");
        }
    }
    //set
    public static void input(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        display(arr);
    }
}
