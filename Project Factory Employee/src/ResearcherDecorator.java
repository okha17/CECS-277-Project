
public class ResearcherDecorator extends EmployeeDecorator
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResearcherDecorator(Faculty decemployee)
	{
		super(decemployee);
	}
	
	public String toString()
	{
		return super.toString() + "  Reasearcher";
	}
}
