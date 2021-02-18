import java.util.Scanner;
public class Rectangle {
	int area,length,breadth;
	Rectangle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter length:");
		length =s.nextInt();
		System.out.println("enter breadth:");
		breadth =s.nextInt();
		
	}
void area()
{
	area=(length*breadth);
	System.out.println(area);
}
void display()
{
	System.out.println("area of rectangle is:");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle obj1=new Rectangle();
obj1.display();
obj1.area();

	}

}
