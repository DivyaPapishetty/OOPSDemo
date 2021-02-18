import java.util.Scanner;

class Trainee
{
	int tId;
	String tName;
	String technology;
	float salary,stipend;	
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Id,Name,technology &salary of a trainee:");
		tId=s.nextInt();
		tName=s.next();
		technology=s.next();
		salary=s.nextFloat();
		
	}
		

float calculate()
{
	stipend=salary-200;
	return stipend;
}

	void display()
{
	System.out.println("******trainee details*****");
	System.out.println("Trainee Id : "+tId);
	System.out.println("Trainee Name : "+tName);
	System.out.println("Technology: "+technology);
	//System.out.println("stipend : "+salary);
	                                     
	}

}

 public class TestTrainee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trainee t1=new Trainee();
Trainee t2=new Trainee();

 float s1=t1.calculate();
 float s2=t2.calculate();
 
t1.display();
System.out.println("stipend : "+s1);
t2.display();
System.out.println("stipend : "+s2);
	
}
	}



