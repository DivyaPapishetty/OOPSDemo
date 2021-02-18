import java.util.ListIterator;
import java.util.LinkedList;

public class ListIterationDemo { 

  public static void main(String[] args) {
    LinkedList<String> carList = new LinkedList<String>();
    carList.add("Audi");
    carList.add("Jaguar");
    carList.add("BMW");
    carList.add("Mini Cooper");
    //Getting ListIterator
    ListIterator<String> ltr = carList.listIterator(); 
    while(ltr.hasNext()){
      String car = ltr.next();
      
      if(car.equals("BMW")) {
          ltr.add("Mercedes");
      }
      if(car.equals("Mini Cooper")) {
          ltr.set("Camry");
      }
    }
    System.out.println("List elements- " + carList);
  }
}