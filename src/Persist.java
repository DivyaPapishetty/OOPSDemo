import java.io.*;
public class Persist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1= new Student(101,"Divya");
FileOutputStream fout=new FileOutputStream("c:\demo\f.txt");
ObjectOutputStream out= new ObjectOutputStream(fout);
out.writeObject(s1);;
out.flush();
System.out.println("success");
	}

}
