import java.util.Comparator;
public class EmployeeIdComparator implements Comparator<Employee> 
{
	public int compare(Employee o1, Employee o2) 
	{
	Employee em1 = (Employee)o1;
	Employee em2 = (Employee)o2;		
	return em1.getID().compareTo(em2.getID());	
	}
}
