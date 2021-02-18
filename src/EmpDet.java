
public class EmpDet {
	String name,address;
	int year;
	public EmpDet(String name,int year,String address)
	{
		this.name=name;
		this.year=year;
		this.address=address;
	}
	void display()
	{
		System.out.println(name+"     "+year+"     "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpDet obj1=new EmpDet("robert",1994," 64-c wallsstreet");
EmpDet obj2=new EmpDet("sam",2000," 68-c wallsstreet");
EmpDet obj3=new EmpDet("john",1999," 26-b wallsstreet");
	System.out.println("name       year of joining     address");
	
	obj1.display();
	obj2.display();
	obj3.display();}

}
