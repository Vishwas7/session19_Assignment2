package TreeSetInJava;

/**
 * 
 * @author Vishwas
 * creating a class Student as mention in the question;
 * than created three fields- name, rollNo and department 
 * and than created a constructor and used getter-setter;
 * this program is based on TreeSet so i need to implement
 * Comparable interface. 
 *
 */
public class Student implements Comparable<Student> {
	String name;
	 int rollNo;
	 String department;
	public Student(String name, int rollNo, String department) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * In here creating toString method
	 * The toString() method returns the string
	 * representation of the object.
	 * 
	 */
	public  String toString(){
		return "Student name is "+ name+".\nRoll number is :"+rollNo+"\nDepartment is "+department+".\n";
		}
	/**
	 * In here i'm overriding  method
	 * and comparing with rollNo by using if statement;
	 * In the TreeSet(),elements in TreeSet must be of Comparable type. 
	 * compareTo(), this method compares this String to another Object.
	 * student-> the Object to be compared.
	 */
	public int compareTo(Student student) {
		if(rollNo>student.rollNo){  
	        return 1;  
	    }else if(rollNo<student.rollNo){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}
	
}
	

 
