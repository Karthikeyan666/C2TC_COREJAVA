//Temperature in october
package com.tns.assignments;
import java.util.Scanner;
public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		int temperature = 30;
		for(int i=1;i<week;i++)
		{
			temperature = temperature-2;
			System.out.println(temperature);
		}


	}



	}


