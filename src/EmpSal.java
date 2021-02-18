
public class EmpSal {
int hours;
double salary;
 
void getInfo(int hours,double salary) {
	this.salary=salary;
	this.hours=hours;
}
void addforWork() {
	if(hours>6) {
		salary+=5;
	}
}
void addSalary() {
	if(salary<500) {
		salary+=10;
		
	}
}
void display() {
	System.out.println("salary is:"+salary+"$");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpSal obj=new EmpSal();
obj.getInfo(5, 330);
obj.addSalary();
obj.addforWork();
obj.display();
	}
}
	


