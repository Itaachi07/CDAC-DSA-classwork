import java.util.Arrays;

public class bubble_sort {
	static void swap(int [] arr1, int a, int b) {
		int temp = arr1[a] ;
		arr1[a]= arr1[b];
		arr1[b]= temp;
	}
	public static void sort1(int []arr1) {
		int iterations = 0;
		int comparison = 0;
		for (int prepos = 0; prepos< arr1.length-1 ; prepos++)
		{  iterations++;
			for (int postpos = prepos+1;postpos < arr1.length-prepos ; postpos++)
			{	comparison++;
				if (arr1[prepos] > arr1[postpos])
				{
					swap(arr1, prepos, postpos);
				}
			}
		}
		System.out.println("iterations :"+iterations);
		System.out.println("comparisons :" +comparison);
	}
	
	
	public static void main(String[] args) {
		int [] arr1 = {300,500,400,900,800,700,100,200}; 
		System.out.println(Arrays.toString(arr1));
		sort1(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
