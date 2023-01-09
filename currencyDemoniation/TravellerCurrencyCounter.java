package com.greatlearning.currencyDemoniation;

import java.util.Scanner;

public class TravellerCurrencyCounter {
	public static void main(String[] args) {
		System.out.println("Enter the size of currency denomination: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the values of currency denomination: ");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}

		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(notes,0,notes.length-1);
		System.out.println("Enter the amount to be paid: ");
		int amount = sc.nextInt();
		NotesCount ns = new NotesCount();
		ns.notesCountImplementation(notes,amount);
	}
}
