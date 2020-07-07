import java.util.List;

public class DisplayFullTimeState implements State{

	public DisplayFullTimeState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(Context context, List<Employee> employeeList)
	{
		context.setState(this);
		 System.out.println("Displaying Full time employees:\n");
		 
		 for(Employee e: employeeList)
		 {
			 if(!(e instanceof Partime) && !(e instanceof Faculty))
             {
                    System.out.println(e.toString());
             }
		 }
	}

	  public String toString(){
	      return "Displaying Full time employees:\n";
	   }

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		
	}
}
