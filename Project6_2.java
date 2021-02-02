import java.util.Scanner;
import java.util.Random;
public class Project6_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number between 1-100");
		int guess = sc.nextInt();
		
		boolean iif = false;
		int counter = 0;
		int num = 1;
		int num2 = 100;
		
		while(iif != true )
				{
		Random rand = new Random();
		
		int rand1 = rand.nextInt(num2-num) + num;
		 
		  counter += 1 ;
		  if (guess == rand1 )
		  {
		  	System.out.println("The guess was " + rand1);
		  	System.out.println("That is correct");
		   	iif = true;
		   	System.out.println("It took "+ counter + " times");
		  }
		  else
		  {
		  	
		  	System.out.println("The guess was " + rand1);
		  	System.out.println("That is incorrect");
		  	if (guess < rand1)
		  	{
		  		
		  		num2 = rand1;
		  		
		  	System.out.println("The number is lower");
		  	System.out.println("");
		  		
		  	}
		  	else
		  	{
		  		
		  		num = rand1;
		  		System.out.println("The number is higher");
		  		System.out.println("");
		  	}
		  	
		  }
		 
		
		}
		

	}			
}