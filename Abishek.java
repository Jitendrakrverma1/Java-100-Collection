package Jitendra;

public class Abishek {
	static int a = 0;
	int b=0;
	Abishek() 
	{
		a++;
		b++;
		System.out.println("Static variable:"+a);
		System.out.println("Instance variable:"+b);
		System.out.println("-----------");
	}
	void display() {
		System.out.println("***Accessing static variable***");
		System.out.println(Abishek.a);
		System.out.println(a);
//		new Abishek();
		System.out.println(new Abishek().a);
	}
	public static void main(String[] args) 
	{
		new Abishek();
		new Abishek();
		new Abishek();
		System.out.println("********");
		new Abishek().display();
	}

}
