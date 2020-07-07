
public class AdministrativeDecorator extends EmployeeDecorator
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdministrativeDecorator(Faculty decemployee)
	{
		super(decemployee);
	}
	
	public String toString()
	{
		return super.toString() + "  Administrative position";
	}
}
