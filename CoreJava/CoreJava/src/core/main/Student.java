package core.main;


class abc{
	 private String name;
	 private int age;
	 private String add;
	 private int roll;
	
	 
	 public void setter(String name , int age , String add, int roll) {
		 
		 
		 this.name = name;
		 this.age = age ;
		 this.add = add;
		 this.roll = roll;
	 }
	 
	
	public void print() {
		System.out.println("Name is : "+ name);
		System.out.println("Age is : "+ age);
		System.out.println("Address is : "+ add);
		System.out.println("Roll Number is : "+ roll);
	
		
		
	}
	
		
}
public class Student {
	


	public static void main(String[] args) {
		
          abc s1 = new abc();
          s1.setter("Vatsal Garg", 23, "Ghaziabad", 170);
          s1.print();
          
          
          abc s2 = new abc();
          s2.setter("Yash Sharma", 23, "Ghaziabad", 170);
          s2.print();
          
          
          abc s3 = new abc();
          s3.setter("sajal Madhwar", 23, "Ghaziabad", 170);
          s3.print();
          
          
          
          abc s4 = new abc();
          s4.setter("Vatsal Garg", 23, "Ghaziabad", 170);
          s4.print();
          

	}

}
