package Constructor;

class Student2 {
	int id;
	String name;

	public Student2(int i, String n) {
		id = i;
		name = n;
	}

	

	void display() {
		System.out.println(id + " " + name);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
         Student2 s1= new Student2(1,"Mohith");
         Student2 s2 = new Student2(2,"Rohith");
         s1.display();
         s2.display();
	}

}
