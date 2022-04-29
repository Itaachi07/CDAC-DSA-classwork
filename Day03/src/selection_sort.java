import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {
	
	public static void sort(int [] arr) {
		int iterations = 0;
		int comparisons = 0;
		for (int selpos = 0; selpos< arr.length-1 ; selpos++)
		{	iterations++;
			for (int pos = selpos+1; pos<arr.length-1 ; pos++ )
			{	comparisons ++;
				if (arr[selpos] >arr[ pos])
				{
					int temp = arr[selpos];
					arr[selpos] = arr[pos];
					arr[pos]= temp;
				}
			}
		}
		System.out.println("no. of iterations are: "+iterations);
        System.out.println("no. of comparisons are: "+comparisons);
	}

	public static void main(String[] args) {
		int [] arr = {30,50,40,90,80,70,10,20};
		//Scanner sc = new Scanner(System.in);
		//int key = sc.nextInt();
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
