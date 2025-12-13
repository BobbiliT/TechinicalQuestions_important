package Techinical_Interview;

//---------------- Abstraction ----------------
abstract class animal {
	String name;

	// Constructor
	animal(String name) {
		this.name = name;
	}

	// abstract method
	abstract void sound();

	// normal method
	public void sleep() {
		System.out.println("animal sleeping");
	}
}

//----------------inteface------------- 
interface pet {
	abstract void play();
}

//-----------------Encapsulation--------------
class info {
	// private variable
	private int age;

	// getter method
	public int getAge() {
		return age;
	}

	// setter method
	public void setAge(int age) {
		this.age = age;
	}
}

//-----------Inheritance + Polymorphism-----------
class dog extends animal implements pet {

	// Constructor Chaining (calling parent constructor)
	dog(String name) {
		super(name);
	}

	// methodoverriding
	public void sound() {
		System.out.println(name + "= woo woo ");
	}

	// methodoverriding from interface
	public void play() {
		System.out.println(name + "playing with bat");
	}

	// method overloading
	public void eat() {
		System.out.println(name + " is eating");
	}

	public void eat(String food) {
		System.out.println(name + " is eating " + food);
	}
}

//-----------main class----------
public class Opps_Example {

	public static void main(String[] args) {
		dog d = new dog("tommy");
		d.sound();
		d.sleep();
		d.play();
		d.eat();
		d.eat("chicken");
		info obj = new info();
		obj.setAge(10);
		System.out.println("dog age -> " + obj.getAge());
	}
}
