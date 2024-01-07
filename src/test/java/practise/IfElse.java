package practise;

import java.util.Scanner;


public class IfElse {
	
	
	

	public static void main(String[] args)  {
		
		
		
		IfElse t=new IfElse();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter number--> ");
		int input=sc.nextInt();
		sc.close();
		int randomNum=(int)(Math.random()*10);
		
		if (input==randomNum)
		{
			System.out.println("Welldone Smarty");
		}
		else
		t.looser();
		

	}
	
	public void looser()
	
	{
	
	int looserNum = (int)(Math.random()*7);
	
	if (looserNum== 0)
	
	System.out.println("u r so stupid");

	else if (looserNum== 1)

	System.out.println("u r rediculus");
	
	else if (looserNum== 2)
	
	System.out.println("why r u on earth!!! go to venus");
	
	else if (looserNum== 3)
	
	System.out.println("u should be hanged out");
	
	else if (looserNum== 4)
	
	System.out.println(" don't dare to play it again");
	
	else
	
	System.out.println(" leave java now!!!");
	
	}

}

