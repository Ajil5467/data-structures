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

    public int[] ArraysSum(){
       
        int[] resultArray = new int[Math.max(n, m)];

        int i = 0;

        while(i<n && i < m){
            resultArray[i] = array1[i] + array2[i];
            i++;
        }

        while(i < n){
            resultArray[i] = array1[i];
            i++;
        }

        while(i < m){
            resultArray[i] = array2[i];
            i++;
        }

        return resultArray;
    
    }

    public void printArray(int[] resultArray){
        for(int i = 0;i<resultArray.length;i++){
            System.out.print(resultArray[i] + " ");
        }

        System.out.println("");
    }
}

public class sum {
    public static void main(String[] args) {
        SumOfArrays sum = new SumOfArrays();

        sum.input();

        int[] resultArray = sum.ArraysSum();

        sum.printArray(resultArray);

    }
}
