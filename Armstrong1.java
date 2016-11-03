package assign2;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {
		int x;
		System.out.println("enter a value");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		

		
        int n = 10; 
		while(n<x)
		{
			
			int length = (int) Math.log10(n) + 1; //to find length of a given number
			int sum = 0;
	    	int num = n;
			int original = num;
			while (num > 0) {
				int t = num % 10;
				sum =sum+ (int)Math.pow(t, length) ;
				num = num / 10;
			}
			if (sum == original) {
				System.out.println(original);
			}
		n++;}
	}
}
