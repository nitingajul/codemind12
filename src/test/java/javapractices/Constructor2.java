package javapractices;

public class Constructor2 {

	public static void main(String args[]) {
		Dog d = new Dog();
		System.out.println(d.name + "  " + d.age + " " + d.weight);
	}

}

class Dog {

	// instance member variables
	String name;
	int age;
	float weight;

	// instance member functions
	public void barking() {
		System.out.println("Dog is barking");
	}

	public void eating() {
		System.out.println("Dog is eating");
	}
	
	// constructor overloading
	public Dog()
	{
		
	}
	
	public Dog(int a)
	{
		
	}
	
	public Dog(float d)
	{
		
	}
	
	public Dog(float d,int a)
	{
		
	}

}
