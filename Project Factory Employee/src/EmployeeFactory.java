import java.util.Scanner;

public class EmployeeFactory
{
	public Employee getEmployee(String employeeType)
	{
		if(employeeType == null)
		{
			return null;
		}
		
		if(employeeType.equalsIgnoreCase("FACULTY"))
		{
			@SuppressWarnings("resource" )
			Scanner in = new Scanner(System.in);
			System.out.println("1) Department Chair \n2) Researcher\n3) Adminsistrative Position");
			System.out.println("Enter which position the faculty holds: ");
			int choice = in.nextInt();
			if(choice == 1)
			{
				return new DepartmentChairDecorator(new Faculty());	

			}
			else if(choice == 2)
			{
				return new ResearcherDecorator(new Faculty());
			}
			else if(choice == 3)
			{
				return new AdministrativeDecorator(new Faculty());
			}
			return new Faculty();
		}
		
		else if(employeeType.equalsIgnoreCase("STAFF"))
		{
			return new Staff();
		}
		
		else if(employeeType.equalsIgnoreCase("PARTIME"))
		{
			return new Partime();
		}
		
		return null;
	}

}
