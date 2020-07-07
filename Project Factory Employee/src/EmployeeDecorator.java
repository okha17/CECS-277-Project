
public abstract class EmployeeDecorator extends Faculty
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employee decemployee;
	public EmployeeDecorator(Faculty decemployee)
	{
		this.decemployee = decemployee;
	}

}
