package practise;

public class RelationalOperator {

	public static void greater()
	
	{
		boolean b;
		int w1=41;
		b=w1 >40;
		System.out.println("Weight greater than 40 if w=41 "+b);

		int w2=39;
		b=w2 >40;
		System.out.println("Weight greater than 40 if w=39 "+b);
		
		int w3=40;
		b=w3 >40;
		System.out.println("Weight greater than 40 if w=40 "+b);
	}
	
	
	public static void less()
	{
		boolean b;
		int w1=41;
		b=w1 <40;
		System.out.println("Weight less than 40 if w=41 "+b);

		int w2=39;
		b=w2 <40;
		System.out.println("Weight less than 40 if w=39 "+b);
		
		int w3=40;
		b=w3 <40;
		System.out.println("Weight less than 40 if w=40 "+b);
	}
	
	public static void equality()
	{
		boolean b;
		int w=39;
		b=w==40;
		System.out.println("Is weight equal to 40 if w=39 "+b);
	}
	public static void main(String[] args) {
		
		greater();
		less();
		equality();
	}

}
