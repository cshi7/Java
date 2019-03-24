public class recordclient
{
	public static void main(String []args)
	{
		record obj1 = new record();
		periodical obj2= new periodical();
		normalbook obj3 = new normalbook();
		
		System.out.println("Printing out Obj1");
		System.out.println(obj1.toString());
		System.out.println("Printing out Obj2");
		System.out.println(obj2.toString());
		System.out.println("Printing out Obj3");
		System.out.println(obj3.toString());
		
		record obj4 = new record("wow","06-09-2017");
		periodical obj5 = new periodical("fuck","01-01-1999","guess");
		normalbook obj6 = new normalbook("apple","02-28-2000","lord");
		
		System.out.println("Printing out Obj4");
		System.out.println(obj4.toString());
		System.out.println("Printing out Obj5");
		System.out.println(obj5.toString());
		System.out.println("Printing out Obj6");
		System.out.println(obj6.toString());
		
	}
}