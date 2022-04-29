import java.util.Scanner;

public class Day02_linearsearch {

    public static int comparisons = 0;

    public static void displayArrayElements(int [] arr){
        System.out.print("array elements are : ");
        for( int index = 0 ; index < arr.length ; index++ ){
            System.out.printf("%4d", arr[ index ] );
        }
        System.out.println();
    }
     //non-recursive function:
     public static boolean linearSearch(int [] arr, int key){
        for( int index = 0 ; index < arr.length ; index++ ){
            comparisons++;
            if( key == arr[ index ] )//if key matches with an array element => key is found => return true
                return true;
        }
        //if key do not matches with any array element => key is not found in an array => return false
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        //int [] arr = { 40, 80, 90, 50, 10, 20, 30, 80, 70, 100 };

        displayArrayElements(arr);
        //step-1: accept key from user
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of key : ");
        int key = sc.nextInt();

        if( linearSearch(arr, key) )//initialization
            System.out.println(key+" is found in an array, no. of comparisons are : "+comparisons);
        else
            System.out.println(key+" is not found in an array, no. of comparisons are : "+comparisons);

    }    
}
