
public class New {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		
		System.out.println(s1);
		
		//compare memory locations
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		//compare values
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1=s1 + "World";
		System.out.println(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
	}

}