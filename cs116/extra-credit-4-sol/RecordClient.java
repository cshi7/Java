class RecordClient{
	public static void main(String []args){
		Hardbook obj1 = new Hardbook();
		ElectronicMag obj2 = new ElectronicMag("Wireless Magazine", "10-01-2017", "Jack Kelso", 10, 12, "http://www.wireless.com/vol12/i10");
		Newspaper obj3 = new Newspaper("Washington Post", "10-05-2017", "Russell Goode", "Washington DC Edition");
		System.out.println("Printing out Obj1");
		System.out.println(obj1.toString());
		System.out.println("Printing out Obj2");
		System.out.println(obj2.toString());
		System.out.println("Printing out Obj3");
		System.out.println(obj3.toString());
	}
}