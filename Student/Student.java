/*
Kaavya Antony
3/2/16
Student Class in Java
*/

// You must save the file as same name as Class, or it won't run
//TO RUN FROM THE COMMAND LINE
//cd into this folder
//compile the file: javac Student.java
//run the class: java Student

public class Student{

	//instance variables, like self.name, self.grade in Python
	//note: they come before the constructor
	//private: stops other files from accessing or changing the variables directly
	//must "type" each variable
	private String name;
	private int grade; 

	//constructor, like def __init__ in Python
	//note: public name of the class (parameters){}
	//incoming variables can't have the same names as the instance variables (name != name, name = name0)
	public Student(String name0, int grade0){
		name = name0;
		grade = grade0;
	}

	//note: that multiple constructors can exist
	//if the parameter is same as the instance variable, use this. 
	public Student(String name){
		this.name = name;
		grade = 0;
	}

	//returns the student's name, getName(self) in Python
	public String getName(){
		return name;
	}

	//sets the students grade, setGrade(self, grade) in Python
	public void setGrade(int grade0){
		grade = grade0;
	}

	//returns the student's grade, getGrade(self) in Python
	public int getGrade(){
		return grade;
	}
/*
	public static void main(String[] args){
		Student student1 = new Student("Jim", 95);
		System.out.println(student1.getName());
		int k = student1.getGrade();
		System.out.println(k);
		student1.setGrade(k + 5);
		System.out.println(student1.getGrade());
		Student student2 = new Student("Ally");
		System.out.println(student2.getGrade());


	}

*/
	



}