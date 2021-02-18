import java.util.Scanner;

class Trainee
{
	int tId;
	String tName;
	String technology;
	float salary;

void input()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter Id,Name,technology &salary of a trainee:");
	tId=s.nextInt();
	tName=s.next();
	technology=s.next();
	salary=s.nextFloat();
	
	
	
}
	void display()
{
	System.out.println("******trainee details*****");
	System.out.println("Trainee Id : "+tId);
	System.out.println("Trainee Name : "+tName);
	System.out.println("Technology: "+technology);
	System.out.println("Stipend : "+salary);
	                                     
	}

}

 public class TestTrainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trainee t1=new Trainee();

t1.input();
t1.display();
	
}
	}


