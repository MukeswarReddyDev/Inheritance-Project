package oops;

class Parent {
	String name = "mk reddy";
	String colour = "white";
	float height = 5.6f;

	void readBook() {
		System.out.println("i love to read books");
	}

	void sport() {
		System.out.println("i love to play cricket");
	}
}

class Child extends Parent {

}

//different types of inheritance
class single {
	int price = 3232;
	float cost = 234.24f;
	String name = "mukesh";

	void pavan() {
		System.out.println("errinakodu");
	}

	void anand() {
		System.out.println("Modull");
	}

	void eswar() {
		System.out.println("Pillana koduku");
	}

}

class singleHeritance extends single

{

}

class Multi extends singleHeritance {

}

class Hierarchy extends Parent {

}

// private
class Bank1 {
	private int accountNumber = 132443;
	private int pin = 3232;

}

class Waste extends Bank1 {
	void disp() {

	}

}

// constructers
class Mam {
	public void Mam() {
		System.out.println("Java sir teaches very well");
	}
}

class Man extends Mam {
	void Man() {

		System.out.println("Sommanna sir teaches very well");
	}
}

// main method for all the inheritance
public class Inheritance1 {

	public static void main(String[] args) {

	
		System.out.println("Basic Inheritance....................");
		Child c = new Child();
		String n = c.name;
		float f = c.height;
		String co = c.colour;
		System.out.println(n);
		System.out.println(f);
		System.out.println(co);
		c.readBook();
		c.sport();
		System.out.println("___________________________________");
		System.out.println("Single Inheritance...................");
		singleHeritance sh = new singleHeritance();

		sh.pavan();
		sh.anand();
		sh.eswar();
		System.out.println("_______________________________________");
		System.out.println("Multi Inheritance...................");
		Multi m = new Multi();
		m.pavan();
		m.anand();
		m.eswar();
		System.out.println("_______________________________________");
		System.out.println("Hierarchy Inheritance...................");
		Hierarchy h = new Hierarchy();
		h.readBook();
		h.sport();
		String nn = c.name;
		float ff = c.height;
		String coo = c.colour;
		System.out.println(nn);
		System.out.println(ff);
		System.out.println(coo);
		System.out.println("_______________________________________");

		System.out.println("Private Members can not be Inheritatedd");
		System.out.println("_______________________________________");
		System.out.println("Constructors can't inheritate");
		Man mm = new Man();
		mm.Man();

	}

}
