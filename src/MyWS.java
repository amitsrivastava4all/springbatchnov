import java.util.ArrayList;

import javax.jws.WebService;

import com.srivastava.dto.Employee;

@WebService
public class MyWS {
	//@WebMethod(operationName="addition")
public int add(int x, int y){
	return x + y;
}

public ArrayList<Employee> getEmployees(){
	// Call helper --> DAO
	ArrayList<Employee> empList = new ArrayList<Employee>();
	for(int i = 1 ; i<=10; i++){
		Employee emp = new Employee();
		emp.setId(i);
		emp.setName("ram"+i);
		emp.setSalary(1000*i);
		empList.add(emp);
	}
	return empList;
}
}
