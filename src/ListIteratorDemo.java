import java.util.ListIterator;
import java.util.ArrayList;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();

al.add("jim");
al.add("jerry");
al.add("john");
al.add(1,"jive");

System.out.println("element at 2nd position:"+al.get(2));
ListIterator<String> itr=al.listIterator();
System.out.println("travesing elements in forward director");
while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println("travesing elements in backward direction");
while(itr.hasPrevious()) {
	System.out.println(itr.previous());
}
	}

}
