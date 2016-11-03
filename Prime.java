package assign2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		

		int i, x;
		int num = 0;

		System.out.println("enter a value");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.close();

		i = 1;
		while (i <= x) 
		{
			int counter = 0;
			for (num = i; num >= 1; num--) 
			{
				if (i % num == 0) 
				{
					counter = counter + 1;
				}
			}
			if (counter == 2)
			{
			
			System.out.print(" " +i);
			}
			i++;
		}
		
	}
}
