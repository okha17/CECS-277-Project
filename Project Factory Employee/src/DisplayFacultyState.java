import java.util.List;

public class DisplayFacultyState implements State {

	public DisplayFacultyState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		
	}

	  public String toString(){
	      return "Displaying faculty employees:\n";
	   }

	@Override
	public void doAction(Context context, List<Employee> employeeList) {
		context.setState(this);
		 System.out.println("Displaying Full time employees:\n");
		 
		 for(Employee e: employeeList)
		 {
			 if(e instanceof Faculty)
			 {
					System.out.println(e.toString());

			 }
		 }
				
	}

}
