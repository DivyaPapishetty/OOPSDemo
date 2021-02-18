

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a1=new ArrayList<String>();//creating arraylist

a1.add("jim");
a1.add("Michael");
a1.add("james");
a1.add("andy");

//traversing elements using Iterator
Iterator itr=a1.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
