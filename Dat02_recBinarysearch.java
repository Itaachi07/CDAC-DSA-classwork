import java.util.Scanner;

public class Dat02_recBinarysearch {
public static int comparisons = 0;

public static void displayArrayElements(int [] arr){
    System.out.print("array elements are : ");
    for( int index = 0 ; index < arr.length ; index++ ){
        System.out.printf("%4d", arr[ index ] );
    }
    System.out.println();
}
public static boolean recBinarySearch(int [] arr, int key, int left, int right){
    //base condition
    if( left > right )//if subarray is invalid => key does not exists
        return false;

    int mid = (left+right)/2;
    comparisons++;
    if( key == arr[ mid ] )//if key matches with ele at mid pos
        return true;
    
    //if key do not matches with ele at mid pos =>
    if( key < arr[ mid ] )//goto search key into the left subarray
        return ( recBinarySearch(arr, key, left, mid-1) );//modification
    else
        return ( recBinarySearch(arr, key, mid+1, right) );//modification
}

public static void main(String[] args) {
    int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    //int [] arr = { 40, 80, 90, 50, 10, 20, 30, 80, 70, 100 };

    displayArrayElements(arr);
    //step-1: accept key from user
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of key : ");
    int key = sc.nextInt();
    
    if( recBinarySearch(arr, key, 0, arr.length-1) )//initialization
    System.out.println(key+" is found in an array, no. of comparisons are : "+comparisons);
else
    System.out.println(key+" is not found in an array, no. of comparisons are : "+comparisons);


}    
    
}
