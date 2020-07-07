import java.util.List;

public class DisplayPartTimeState implements State{

	public DisplayPartTimeState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(Context context) {
		context.setState(this);
		
	}

	  public String toString(){
	      return "Displaying faculty employees:\n";
	   }

	@Override
	public void doAction(Context context, List<Employee> employeeList) {
 System.out.println("Displaying Full time employees:\n");
		 
		 for(Employee e: employeeList)
		 {
			 if(e instanceof Partime)
			 {
					System.out.println(e.toString());

			 }
		 }		
	}

}
