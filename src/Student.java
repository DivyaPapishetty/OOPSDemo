
public class Student {

	int rollno;
	String name,course;
	int marks;
	 public Student(int rollno,String name,int marks,String course)
	 {
		 this.rollno=rollno;
		 this.name=name;
		 this.marks=marks;
		 this.course=course;
	 }
	 public int getRollno()
	 {
		 return rollno;
	 }
	 public void setRollno(int rollno)
	 {
		 this.rollno=rollno;
	 }
	 public int getName()
	 {
		 return name;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public int getMarks()
	 {
		 return marks;
	 }
	 public void setMarks(int marks)
	 {
		 this.marks=marks;
	 }
	 public int getCourse()
	 {
		 return course;
	 }
	 public void setCourse(String course)
	 {
		 this.course=course;
	 }
	 
}
	 