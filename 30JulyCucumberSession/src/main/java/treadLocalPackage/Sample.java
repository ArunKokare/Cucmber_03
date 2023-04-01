package treadLocalPackage;

public class Sample { // this class for understand threadlocal concept
	
	 static ThreadLocal<String> tl = new ThreadLocal<String>();
	
	public  String xyz(String c)
	{
		String city1 = "I am from" ;
		tl.set(c);
		
		return getCity();
	}

	public static synchronized String getCity()
	{
		String abc = tl.get();
		return abc ;
	}
	
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.xyz("pune");
		System.out.println(Sample.getCity());
	}

}
