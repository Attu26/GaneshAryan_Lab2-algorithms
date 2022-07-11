package com.greatlerning.transaction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the size of the currency in Denomination value");

Scanner sc = new Scanner(System.in);
int size = sc.nextInt(); //3
int [] currency = new int [size]; //currency contains size currency 0,1,2

System.out.println("eneter the currency denomination value");

for (int i =0;i<size;i++)
{
	currency [i] = sc.nextInt();
	
}
	System.out.println("enter the amount to be paid");
	
	int amount = sc.nextInt();
	
	MergeSort sort = new MergeSort();
	sort.sort(currency, 0, currency.length-1);
	NotesCount notesCount = new NotesCount();
	notesCount.notesCountImplementaion(currency, amount);
	}

}


	

