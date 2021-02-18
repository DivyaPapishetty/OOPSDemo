
public class Contact {
void CreateContact(String name,int num)
{
	System.out.println("Name:"+name +"Num:"+num);
	
}
void CreateContact(String name1,int num1,int num2)
{
	System.out.println("Name:"+name1 +"Num1:"+num1+"Num2:"+num2);
	
}
public static void main(String[] args) {
Contact c=new Contact();
c.CreateContact("DIV",10);
c.CreateContact("luv",10,20);
}
}