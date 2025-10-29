package core.main;







abstract class Vehicle{
	
	public abstract void run();
	public abstract void stop();
	
	
}


abstract class Carr extends Vehicle{
	
	
	
	public abstract void ac();
	public abstract void breeak();
	public abstract void speed();
	public abstract void music();
	public abstract void hooter();
	
	
}

class WagonR extends Carr{
	public void run() {
		System.out.println("running1");
	}
	
	public void stop() {
		System.out.println("running1");
	}
	public void ac() {
		System.out.println("running1");
	}
	public void breeak() {
		System.out.println("running1");
	}
	public void speed() {
		System.out.println("running1");
	}
	public void music() {
		System.out.println("running1");
	}
	public void hooter() {
		System.out.println("running1");
	}
}
class Audi extends Carr{
	public void run() {
		System.out.println("running2");
	}
	
	public void stop() {
		System.out.println("running2");
	}
	public void ac() {
		System.out.println("running2");
	}
	public void breeak() {
		System.out.println("running2");
	}
	public void speed() {
		System.out.println("running2");
	}
	public void music() {
		System.out.println("running2");
	}
	public void hooter() {
		System.out.println("running2");
	}
	
}
class Fortuner extends Carr{
	public void run() {
		System.out.println("running3");
	}
	
	public void stop() {
		System.out.println("running3");
	}
	public void ac() {
		System.out.println("running3");
	}
	public void breeak() {
		System.out.println("running3");
	}
	public void speed() {
		System.out.println("running3");
	}
	public void music() {
		System.out.println("running3");
	}
	public void hooter() {
		System.out.println("running3");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		
		
		WagonR v1 = new WagonR();
	v1.run();
	v1.stop();
	v1.ac();
	v1.breeak();
	v1.speed();
	v1.music();
	v1.hooter();
	
	Audi v2 = new Audi();
	v2.run();
	v2.stop();
	v2.ac();
	v2.breeak();
	v2.speed();
	v2.music();
	v2.hooter();
	
	Fortuner v3 = new Fortuner();
	v3.run();
	v3.stop();
	v3.ac();
	v3.breeak();
	v3.speed();
	v3.music();
	v3.hooter();
	

	
	}
}
