import java.util.List;

public interface State {


	public void doAction(Context context);

	void doAction(Context context, List<Employee> employeeList);
}
