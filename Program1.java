package come.simplilern.package1;

public class Program1 {
	
	String name="Pratik";
	
	//constructor
	Program1()  // two type of constructor this is Default
	{
		//this(5);
		
		System.out.println("Constructor excute first after create obj");
		System.out.println(name); // here also this hide 
	}
	
	Program1(int x)   // this is parameter constructor
	{
		this(); // this is use for call default constructor  must write on first line in constructor 
		
		int fect = 1;
		for(int i=1; i<=x; i++)
		{
			//fect =fect *i;
			fect *=i;
		}
		System.out.println("Fectorial of "+x+" = "+fect);
	}
	
	
	//this instance block It's excute when obj create
	{
		System.out.println("Instance Block");
		System.out.println("Without this"+"Name => "+name);  // concept of this keyword here this is hide without object we can,t access instance veriable ,mathod ..etc 
		System.out.println("With this"+"Name => "+this.name); // here i write same 
	}

	//public static void main(String[] ps) {
		public static void main(String...ps) {    // this is var_arg concept 
		
		
		
		new Program1(6); // object creation   // if i make give here parameter 
		
		System.out.println("Main Method");
		
		//System.out.println(name); // we can't access instance variable in static area  

	}
	
	//this is ststic blocak it's excute automatic 
	static {
		System.out.println("Static Block");
	}

}
