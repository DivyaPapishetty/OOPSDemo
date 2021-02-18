
public class PersonTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Person objPerson=new Person();//invole default
Person objPerson1=new Person("div",23);//parameterised constructor
Person objPerson2=new Person("mike",50,"delhi");
objPerson.input();
objPerson.print();
objPerson1.print();
objPerson2.print();
	}

}
