import java.lang.reflect.Field;
import java.util.Scanner;
// In Java U Can't create a Class without inheritance
class A  //extends Object
{
	private int x=10;
	private int z = 30;
	public int y=20;
	A(){
		System.out.println("A Class Cons Call.....");
	}
}
class B{
	B(){
		System.out.println("B Class Cons Call");
	}
}
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class Name");
		String className = scanner.next();
		Object object = Class.forName(className).newInstance();
		System.out.println("Enter the Variable Name");
		String varName = scanner.next();
		Field field = object.getClass().getDeclaredField(varName);
		field.setAccessible(true);
		//field.setAccessible(true);
		Object value = field.get(object);
		System.out.println(value);
		//A obj = new A();
		//B obj2 = new B();
		//obj.x = 100;
		//A obj = new A();
		//obj.
		//System.out.println(obj.);
	}

}
