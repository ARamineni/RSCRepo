package rsc.cr.createp;

public class ComponentRepositorycCreate  {
	int a=10;
	int b=20;
	static int c;
	
	public void add()
	{
		
		c= a+b;	
		System.out.println("addition of a and b is" + c);
	}
	
	public static void main(String[] args)
	{
		System.out.println("create mode screen");
		
		ComponentRepositorycCreate cr1 = new ComponentRepositorycCreate();
		cr1.add();
	}
	

}
