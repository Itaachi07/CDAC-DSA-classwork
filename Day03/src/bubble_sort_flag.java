import java.util.Arrays;

public class bubble_sort_flag {
	
	public static void swap1(int[]arr2 ,int a, int b)
	{	
		int temp = arr2[a];
		arr2[a] = arr2[b];
		arr2[b] = temp;
		
	}
	public static void sort2(int [] arr2)
	{	
		int iterations =0;
		int comparison = 0;
		boolean flag = true;
		
		for(int fpos = 0; fpos<arr2.length-1 && flag == true ; fpos++ )
		{	iterations++;
			flag = false;
			for(int spos = 0; spos<arr2.length-1-fpos ; spos++)
			{	comparison++;
				if(arr2[spos] > arr2[spos+1])
				{
					swap1(arr2, spos, spos+1);
					flag = true;
				}
			}
		}
		System.out.println("itreations : " +iterations);
		System.out.println("comparison : " +comparison);
	}

	public static void main(String[] args) {
		int [] arr2 = {300,500,400,900,800,700,100,200}; 
		System.out.println(Arrays.toString(arr2));
		sort2(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
