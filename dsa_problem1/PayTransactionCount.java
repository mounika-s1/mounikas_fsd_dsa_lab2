package dsa_problem1;

import java.util.Scanner;

public class PayTransactionCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the daily transactions into transaction array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the total number of targets that need to be achieved:");
		int targetNumber = sc.nextInt();
		while (targetNumber-- != 0) {
			int flag = 0;
			long targetValue;
			long sum = 0;
			System.out.println("Enter the value of target:");
			targetValue = sc.nextLong();
			for (int i = 0; i < size; i++) {
				sum = sum + arr[i];
				if (sum >= targetValue) {
					System.out.println("Target value achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achievable!");
			}

		}

	}
}
