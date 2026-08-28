package com.codegnan.student;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[][] sales = { { 12000, 15000, 18000 }, { 10000, 11000, 14000 }, { 17000, 16000, 19000 },
				{ 13000, 12500, 14500 } };

		int grandTotal = 0;

		System.out.println("Sales Data:");

		for (int i = 0; i < sales.length; i++) {
			int personTotal = 0;

			System.out.print("Salesperson " + (i + 1) + ": ");

			for (int j = 0; j < sales[i].length; j++) {
				System.out.print(sales[i][j] + " ");
				personTotal += sales[i][j];
			}

			System.out.println("\nTotal Sales = " + personTotal);
			System.out.println();

			grandTotal += personTotal;
		}

		System.out.println("Grand Total Sales = " + grandTotal);*/
		
//		int[] arr= {1,2,3,4};
//		System.out.println("Reversed array:");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+ " ");
//		}
		
//		int a[]= {1,2,3,4};
//		int b[]= {3,4,5,6};
//		System.out.println("Common elements:");
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<b.length;j++) {
//				if(a[i]==b[j]) {
//					System.out.print(a[i]+" ");
//				}
//			}
//		}
		
		int arr[]= {100,30,50,78,98};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
			System.out.println("Largest:" +largest);
			System.out.println("Smallest:" +smallest);
		
	}

}
