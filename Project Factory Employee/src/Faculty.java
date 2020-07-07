import java.text.DecimalFormat;
import java.util.Scanner;


public class Faculty extends Employee implements Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum Level {
		ASSISTANT_PROFESSOR,
		ASSOCIATE_PROFESSOR,
		FULL; 
	}
	private Level prof;
	private Education edu;
    private static DecimalFormat df2 = new DecimalFormat("#.00");
	
    
    public void setEdu(Education e){
    	edu = e;
    }
    
	Faculty() {
		super();
		edu = new Education();
	}
	
	Faculty(String l_name, String f_name, String Id, char gen, int month, int day, int year, String d, String m, int r, Level pro) {
		super(l_name, f_name, Id, gen, month, day, year);
		this.setRank(pro); 
		edu = new Education(d,m,r);
		
	}
	
	public Level getRank() {
		return prof;
	}
	
	public void setRank(Level pro) {
		this.prof = pro;
	}
	
	public double monthlyEarning() {
		if(prof == Level.ASSISTANT_PROFESSOR) {
			return 5000.00;
		}
		else if(prof == Level.ASSOCIATE_PROFESSOR) {
			return 7500.00;
		}
		else {
			return 10000.00;
		}
		
	}		
	
	public String toString() {
		return super.toString() + "\n" +  "  " + "Level: " + prof + "\n" + "  " + "Degree: " + edu.getDegree() +
		"\n" + "  " + "Major: " + edu.getMajor() + "\n" + "  " + "Research: " + edu.getResearch() + "\n" + "  " + 
		"Monthly Salary: " + "$" + df2.format(monthlyEarning()) + "\n";
	}
	  
	public Object clone() throws CloneNotSupportedException
	{
		Faculty e = (Faculty)super.clone();
		edu = (Education) edu.clone();
		e.setEdu(edu);
		return e; 
		}
	
	@Override
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
	
	public void setEmployee() 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter last name: ");
		setLastName(in.next());
		System.out.println("Enter first name: ");
		setFirstName(in.next());
		System.out.println("Enter ID number: ");
		setID(in.next());
		System.out.println("Enter gender");
		setGender(in.next().charAt(0));
		System.out.println("Enter the birthday in the following order: MM/DD/YYYY");
		int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();
		//GregorianCalendar birthDay = new GregorianCalendar();
		setBirthday(month,day,year);		
		System.out.println("Enter this faculty employee's level from three choices: ");
		System.out.println("1) Assistant Professor: ");
		System.out.println("2) Associate Professor: ");
		System.out.println("3) Full Time Professor: ");
		System.out.println("Choice: ");
		int levelChoice = in.nextInt();
		switch(levelChoice)
		{
			case 1:
				setRank(Level.ASSISTANT_PROFESSOR);
				break;
				
			case 2:
				setRank(Level.ASSOCIATE_PROFESSOR);
				break;
				
			case 3:
				setRank(Level.FULL);
				break;
		}
		System.out.println("Enter degree: ");
		Education e = new Education();
		e.setDegree(in.next());
		System.out.println("Enter major: ");
		e.setMajor(in.next());
		System.out.println("Enter research: ");
		e.setResearch(in.nextInt());
		setEdu(e);
	}
	
	public void changeEdu()
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter degree: ");
		Education e = new Education();
		e.setDegree(in.next());
		System.out.println("Enter major: ");
		e.setMajor(in.next());
		System.out.println("Enter research: ");
		e.setResearch(in.nextInt());
		setEdu(e);
	}
}
