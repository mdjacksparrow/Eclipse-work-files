package myproject;

public class ArrayTest {

	public static void main(String[] args)
	{
		int[] arr1 = {1,8,2,5,3};
		int[] arr2 = {4,3,6,9,7};

		int aLen,bLen;
		
		sort(arr1,5); 
		sort(arr2,5);
		
		aLen = arr1.length;
		bLen = arr2.length;
		int[] arr3 = new int[aLen + bLen];
		
		System.arraycopy(arr1, 0, arr3, 5, aLen);
	    System.arraycopy(arr2, 0, arr3, aLen, bLen);
	    
	    sort(arr3 , (aLen + bLen));
		
       System.out.print("Ascending Order:");
        for (int i = 0; i < (aLen + bLen) - 1; i++) 
        {
            System.out.print(arr3[i] + ",");
        }
        System.out.print(arr3[(aLen + bLen) - 1]);
		
	}
	
	public static void sort(int arr[],int n) 
	{
		int temp;
	    for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
	}

}
