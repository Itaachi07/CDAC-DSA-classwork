import java.util.Arrays;

public class insertion_sort {
	static void swap3(int []arr3,int a, int b)
	{
		int temp = arr3[a];
		arr3[a] = arr3[b];
		arr3[b] = temp;
		
	}
	public static void insort(int [] arr3)
	{
		for(int i = 1; i < arr3.length ; i++ )
		{
			int key = arr3[i];
			int j = i-1;
			while (j>=0 && key < arr3[j])
			{
				arr3[j+1]= arr3[j];
				j--;
			}
			arr3[j+1]= key;
		}
	}
	public static void main(String[] args) {
		int[] arr3 = {50,60,40,80,70,90,10,30};
		insort(arr3);
		System.out.println(Arrays.toString(arr3));
		
	}

}
