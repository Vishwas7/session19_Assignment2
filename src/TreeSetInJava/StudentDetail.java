package TreeSetInJava;

/**
 * In here importing class, which are belong from java.util.package;
 */
import java.util.Iterator;
import java.util.TreeSet;
/**
 * 
 * @author Vishwas
 * In here created a class StudentDetail to store detail of 
 * students by using TreeSet;
 * 
 *
 */
public class StudentDetail {

	public static void main(String[] args) {
		TreeSet<Student> objStudent= new TreeSet<Student>();
		System.out.println("Display of students detail by using TreeSet\n");
		 /**
		  * Creating Students  
		  * and adding Students to TreeSet 
		  * 
		  */
		Student one= new Student("Vishwas",37,"Botany");
		Student second= new Student("Raju",30,"Geology");
		Student third= new Student("Amit",4,"Zoology");
		objStudent.add(one); 
		objStudent.add(second);  
		objStudent.add(third);
		/**
		 * In here using iterator
		 * and than using while loop for checking the value
		 * and call hasNext() which will returns true if there are 
		 * more elements. Otherwise, returns false.
		 */
		Iterator iterator=objStudent.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}

