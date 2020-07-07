import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.Serializable;
import java.lang.Comparable;
/**
 * The Employee class is a super class that is the parent class to Staff, and Faculty
 * It must be an abstract class due to being a super class and must implement comparable,
 * cloneable and Employee_Info. 
 * @author Osman
 */

public abstract class Employee implements Comparable<Employee>, Cloneable, Serializable {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String last_name;
	private String first_name;
	private String ID_num;
	private char gender;
	private Calendar birthday = new GregorianCalendar(); 
	/**
	 * Default constructor that sets the private data members to their
	 * initial values of NULL
	 */
	Employee() {
		last_name = null;
		first_name = null;
		ID_num = null;
		gender = ' ';
	}

	/**
	 *  Argument constructor that calls setters for all the private data members
	 * @param l_name 
	 * @param f_name 
	 * @param Id ID number 
	 * @param gen 
	 * @param month 
	 * @param day
	 * @param year
	 */
	Employee(String l_name, String f_name, String Id, char gen, int month, int day, int year) {
		this.setLastName(l_name);
		this.setFirstName(f_name);
		this.setID(Id);
		this.setGender(gen); 
		this.setBirthday(month, day, year);
	}
	/**
	 * Public method that accesses last name
	 * @return the last name
	 */
	public String getLastName() {
		return last_name;
	}
	/**
	 * Public method that modifies the last name, and this refers
	 * to the current object calling it.
	 * @param l_name is assigned to the last name
	 */
	public void setLastName(String l_name) {
		this.last_name = l_name;
	}

	public String getFirstName() {
		return first_name;
	}
	
	public void setFirstName(String f_name) {
		this.first_name = f_name;
	}
	
	public String getID() {
		return ID_num;
	}
	
	public void setID(String Id) {
		this.ID_num = Id;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gen) {
		this.gender = gen;
	}
	/**
	 * Get birthday method that returns date in correct format
	 * @return a String for month day and year format
	 */
	public String getBirthday() {
		 return birthday.get(Calendar.MONTH) + "/" + birthday.get(Calendar.DAY_OF_MONTH) + "/" + birthday.get(Calendar.YEAR);
		 
	}
	/**
	 * Using Java.util Calendar to set all the values of the employee's birthday
	 * @param month pass month into the method using a calendar setter
	 * @param day pass day into the method using a calendar setter
	 * @param year pass year into the method using a calendar setter
	 */
	public void setBirthday(int month, int day, int year) {
	    birthday.set(Calendar.MONTH, month);
	    birthday.set(Calendar.DAY_OF_MONTH, day); 
	    birthday.set(Calendar.YEAR, year);
	}
	/**
	 * A toString that gets inherited into the sub classes. Displays the correct format 
	 * for the employee information 
	 */
	public String toString() {
		String Employee;
		Employee = "\n" + "  " + "Last Name: " + last_name + "\n" + "  " + "First name: " + 
		first_name + "\n" + "  " + "ID: " + ID_num + "\n" + "  " + "Sex: " + 
		gender + "\n" + "  " + "Birth date: " + getBirthday(); 
		return Employee;
	}
	/**
	 * abstract method that is implemented in the sub classes. 
	 * @return Returns the salary an employee makes in a month for the sub classes
	 */
	public abstract double monthlyEarning();
	
	/**
	 * public clone method that is used in order to make a copy of an object.
	 * Needed in the Employee class to be used for a copy of a Faculty object.
	 */
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	/**
	 * Public method that is used to compare employee's last names to sort them in descending order
	 * Depending on if you return a negative or positive will determine the sorting order.
	 * @param other Type Employee that is used to compare one last name to the other.
	 * @return The method returns a type int in order to sort the array. Array.sort is used in 
	 */
	public int compareTo(Employee other) {
		if (getLastName().compareTo(other.getLastName()) > 0)
		{ 
			return -1;
		}
		if (getLastName().compareTo(other.getLastName()) < 0)
		{ 
			return 1;
		}
		else 
		return 0;
    }
	
	public abstract void setEmployee();
}
