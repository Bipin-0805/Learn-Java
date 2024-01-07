package practise;

public class CreateObject {

	public static void main(String[] args) {
		
		int rolldice= (int)(Math.random()*7);
		System.out.println(rolldice);
		if (rolldice==0)
				System.out.println("Try again");
		else
		{
			System.out.println("move");
		}
		

	}

}
