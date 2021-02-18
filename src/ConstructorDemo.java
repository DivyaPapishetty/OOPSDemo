
public class ConstructorDemo {
	int id;
	ConstructorDemo()
	{
		System.out.println("In Constructor");
		id=10;
	}
	void display()
	{
		System.out.println(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDemo obj1=new ConstructorDemo();
//define obj and ivokes constructor
ConstructorDemo obj2=new ConstructorDemo();
	}

}
