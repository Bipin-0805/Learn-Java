package practise;

import java.util.Scanner;

public class Tertionary {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int age=sc.nextInt();
		 sc.close();
		 String s=age>=18 ? "Eligible":"Not eligible";
		 System.out.println(s);
		 

	}

}
