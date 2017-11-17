import java.util.ArrayList;

public class Person {
	
	String name;
	int age;
	String job;
	
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
				
	}
	
	public String toString() {
		
		return "Name: "+ name +"\n" + "Age: " + age + "\n" + "Job: " + job;
		}
	
	
	
	
	public static void main(String[] args) {
		
		Person a = new Person("Jack",21,"Accountant");
		Person b = new Person("Stacy",23,"Teaching Assisstant");
		Person c = new Person("Stacy",18,"Student");
		Person d = new Person("Stacy",40,"manager");
		Person e = new Person("Stacy",32,"doctor");
		Person f = new Person("Stacy",29,"manager");
		//System.out.println(a);
		//System.out.println("");
	   //System.out.println(b);
		
ArrayList<Person> employees = new ArrayList<Person>();
		
		employees.add(a);
		employees.add(b);
	
		
		for (Person i : employees) {
			System.out.println(i);
			}
			
		
		}

}