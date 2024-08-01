package javapractices;

public class Student {

	String name;
	float age;
	int rollNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student sachin = new Student("sachin", 30.4f, 1);
		sachin.studentInfo();

		Student virat = new Student("virat", 35, 2);
		virat.studentInfo();

	}

	public Student(String name1, float age1, int rollNo1) {
		name = name1;
		age = age1;
		rollNo = rollNo1;
	}

	public void studentInfo() {
		System.out.println(name + " " + age + " " + rollNo);
	}

}
