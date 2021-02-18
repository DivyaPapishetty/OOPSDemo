
//	class Bike
	
	​​​​
	//	 final int speedlimit=90;//final variable
	//	 void run() {​​​​
	//	  speedlimit=400;
		 }​​​​
	//	 public static void main(String args[]){​​​​
	//	 Bike obj=new  Bike();
//		 obj.run();
		 ​​​​
	//error because final speedlimit cannot be changed	​​​​
	
	class Bike{​​​​
		 final int speedlimit=90;//final variable
		 void run(){​​​​
		  //speedlimit=400;
			 System.out.println("speed limit of bike:"+speedlimit);
		 }​​​​
		 public static void main(String args[])
		 {​​​​
		 Bike obj=new  Bike();
		 obj.run();
		 }​​​​
		}​​​​