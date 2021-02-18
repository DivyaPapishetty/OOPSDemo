class Student200
{
  private int rollno;
private String name;
static String college="BMS";
public static void changeCollege()
{
	college="RVCE";
	
}
public Student200(int r,String n)
{
	rollno=r;
	name=n;
} 
public void display()
{
	System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student200.changeCollege();//call static method without  creating object
Student200 s1=new Student200(101,"Raj");
Student200 s2=new Student200(102,"mike");
Student200 s3=new Student200(103,"john");
s1.display();
s2.display();
s3.display();
	}

}
