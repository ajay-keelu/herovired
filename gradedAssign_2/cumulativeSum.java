package assignmentHV.gradedAssign_2;

import java.util.*;
public class cumulativeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter elements : ");
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			arr[i] += sum;
			sum = arr[i];
		}
		print(arr);
		sc.close();
	}
	public static void print(int[] arr) {
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			System.out.print(arr[i] +", ");
		}
		System.out.print(arr[arr.length - 1]);
	}

}
