/* ACD_JAVAB_Session_4_Assignment_3_Main : 
 * Create a encapsulation class for employee details.*/

package session4;

class Employee
{
	private int EmpID;
	private String EmpName;

	public Employee()
	{
		EmpID = 100;
		EmpName = "BALU";
	}
	
	public int getEmpID() 
	{
		return EmpID;
	}
	public void setEmpID(int empID) 
	{
		EmpID = empID;
	}
	public String getEmpName() 
	{
		return EmpName;
	}
	public void setEmpName(String empName)
	{
		EmpName = empName;
	}

	public String toString() {
		return "Employee [EmpID=" + EmpID + ", EmpName=" + EmpName + "]";
	}
}

public class ACD_JAVAB_Session_4_Assignment_3_Main 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		System.out.println(emp);		
		emp.setEmpID(923);
		emp.setEmpName("BALACHANDRA");
		System.out.println(emp);

	}
}
/* OUTPUT
 
Employee [EmpID=100, EmpName=BALU]
Employee [EmpID=923, EmpName=BALACHANDRA]

*/		
