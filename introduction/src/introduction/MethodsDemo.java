package introduction;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//why method-
		MethodsDemo d=new MethodsDemo();
		String name = d.getData();
		System.out.println(name+"123");
		
		MethodsDemo2 d2= new MethodsDemo2();
		String name1 = d2.getUserData();
		System.out.println(name1);
	}

	public String getData() {
		System.out.println("hello world");
		return "daniyar";
	}
	
}
