
import java.util.Scanner;

public class Day02_recLinearSearch {
    
    public static int comparisons = 0;

    public static void displayArrayElements(int [] arr){
        System.out.print("array elements are : ");
        for( int index = 0 ; index < arr.length ; index++ ){
            System.out.printf("%4d", arr[ index ] );
        }
        System.out.println();
    }
    public static boolean recLinearSearch(int [] arr, int key, int index){
        //base condition
        if( index == arr.length )//if key do not matches with any of array ele => key is not exists
            return false;

        comparisons++;
        if( key == arr[ index ] )//if key mathces with any of array element => key is found
            return true;

        return ( recLinearSearch(arr, key, index+1) );//modification
    }
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        //int [] arr = { 40, 80, 90, 50, 10, 20, 30, 80, 70, 100 };

        displayArrayElements(arr);
        //step-1: accept key from user
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of key : ");
        int key = sc.nextInt();

        if( recLinearSearch(arr, key,0) )//initialization
            System.out.println(key+" is found in an array, no. of comparisons are : "+comparisons);
        else
            System.out.println(key+" is not found in an array, no. of comparisons are : "+comparisons);

    }    
}

