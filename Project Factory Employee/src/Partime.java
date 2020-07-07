import java.util.Scanner;

public class Partime extends Staff {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double hours_worked;
	
	Partime() {
		super();
		hours_worked = 0.0;
	}
	
	Partime(String l_name, String f_name, String Id, char gen, int month, int day, int year, double h_rate, double h_work) {
		super(l_name, f_name, Id, gen, month, day, year, h_rate);
		this.setHoursWorked(h_work);
	}
	
	public double getHoursWorked() {
		return hours_worked;
	}
	
	public void setHoursWorked(double h_worked) {
		this.hours_worked = h_worked;
	}
	
	public double monthlyEarning() {
		return super.getHourlyrate()*hours_worked*4;
	}
	
	public String toString() {
		return super.toString() + "\n"  + "  " + "Hours worked per week: " + hours_worked + "\n"; 
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
		//birthDay = new GregorianCalendar();
		setBirthday(month,day,year);
		System.out.println("Enter the hourly rate: ");
		setHourlyRate(in.nextDouble());
		System.out.println("Enter the hours worked: ");
		setHoursWorked(in.nextInt());
	}

}
