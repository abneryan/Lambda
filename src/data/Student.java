package data;

public class Student {
	public String name;
	public int age;
	
	public Student(){
		System.out.println("student-1");
	}
	
	public Student(String name, int age){
		System.out.println("student-2");
		this.age =age;
		this.name =name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
