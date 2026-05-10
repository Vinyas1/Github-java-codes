package javex;

public class sel {
 
    public static void selectionSort(int[] arr) {
        int n = arr.length;
for(int i=0;i<n-1;i++) {
	int minindex = i;
	for(int j=i+1;j<n;j++) {
		if(arr[minindex]>arr[j]) {
			minindex=j;
		}
	}
	
	int temp = arr[minindex];
	arr[minindex]= arr[i];
	arr[i]= temp;
	
}
	
}

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
