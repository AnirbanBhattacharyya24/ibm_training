import java.util.function.Consumer;

public class LambdaDemo {
	public static void print(Object obj) {
		System.out.print(obj);
	}
	
	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s);
		c1.accept("hello");
		
		Consumer<String> c2 = System.out::println;
		c2.accept("Bojour");
		
		Consumer<String> c3 = LambdaDemo::print;
		c3.accept("Aloha");
	}
}