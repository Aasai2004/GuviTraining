package day3;
public class BaseClass {
	public static void main(String[] str) {
		DeriveClass d = new DeriveClass(1,2);
		d.display();
		d.display1();
		
		
		

	}
}
class Base1{
	int a;
	Base1(int a){
		this.a=a;
		System.out.println("base class");
	}
	public void display() {
		System.out.println("base class for display"+a);
	}
}
class DeriveClass extends Base1{
    int b;
	DeriveClass(int a, int b) {
		super(a);
		System.out.println("derived class " + a + " ," +b);
	}
	public void display1() {
		System.out.println("derive class for display "+a);
	}
	
}