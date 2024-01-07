package practise;

public class TypeConversion {
	
	public void implicitConversion()
	{
/* Example 1 -> implicit conversion ( automatic conversion ) */
		
		int a=5;
		float b;
		b=a;
		System.out.println(b);
	}
	
	public void explicitConversion()
	{
		
		//Example 2 -> Explicit Conversion 
		
		int a;
		float b= 2.5f;
		a=(int)b;
		System.out.println(a);
	}
	
	public static void ParseInteger()
	{
		String s="5";
		int a=Integer.parseInt(s);
		System.out.println(a);
	}
	 
	public static void IntToString()
	{
	int a=56;
	String s=Integer.toString(a);
	System.out.println(s);
	}
	
	public static void FloatToString()
	{
	float a=56.2f;
	String s=Float.toString(a);
	System.out.println(s);
	}
	
	

	public static void main(String[] args) {
			
			TypeConversion tc=new TypeConversion();
			
			tc.implicitConversion();
			tc.explicitConversion();
			ParseInteger();
			IntToString();
			FloatToString();

	}

}
