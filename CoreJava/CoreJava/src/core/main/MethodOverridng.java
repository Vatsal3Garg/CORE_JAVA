package core.main;




class Animall{
	private String name;
	private int id;
	
	
	public void eat() {
		
		System.out.println( "Animal is eating");
	}
	public void sleep() {
		
		System.out.println("Animal is Sleeping");
	}
}



class Dogesh extends Animall{
	
	@Override
	public void eat () {
		System.out.println("Dogesh is eating");
		
	}
}

class Cow extends Animall{
	
	@Override
	public void eat () {
		System.out.println("Cow is eating");
		
	}
}
public class MethodOverridng {
	
	
	public static void main(String[] args) {
		Dogesh d = new Dogesh();
		d.eat();
		d.sleep();
		System.out.println("----------");
		Cow c = new Cow();
		c.eat();
		c.sleep();
		
	}

}
