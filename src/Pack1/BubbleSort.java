package Pack1;

public class BubbleSort {

	void bubbleSort(int arr[]) {
		// int n=arr.length; int arr[]={64,32,40,0,-1};
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.println(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 64, 32, 0, 40, 0, -1 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
