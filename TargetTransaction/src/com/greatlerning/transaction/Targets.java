package com.greatlerning.transaction;

import java.util.Scanner;


public class Targets {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("eneter the transaction count");
int size = sc.nextInt(); //size = 3
int arr[] = new int [size]; // array size = 3, 0, 1,2
System.out.println("enter the values");

for (int i=0;i<size;i++)
{
	arr[i] = sc.nextInt(); //0 - rs 100 pass this to some other iteration data store
	
	}
System.out.println("eneter the target value");
int targetNo = sc.nextInt(); // 2 , target =100 and 2nd target = rs 200

while (targetNo-- !=0) {
	int flag = 0; //
	long target;
	
	System.out.println("eneter the total target number");
	target = sc.nextLong();
	
	long sum =0 ;
	
	for (int i=0;i<size;i++) {
		sum += arr[i]; /// 20, 12, 31
		
		if (sum>=target) {
			System.out.println("target reached");
			flag = 1;
			break;
			
		}
	}
			
}


}
	{
		
	}
	{
		{
			
		}
	}}

