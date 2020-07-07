
public class DepartmentChairDecorator extends EmployeeDecorator
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DepartmentChairDecorator(Faculty decemployee)
	{
		super(decemployee);
	}
	
	public String toString()
	{
		return super.toString() + "  Department Chair";
	}
}
