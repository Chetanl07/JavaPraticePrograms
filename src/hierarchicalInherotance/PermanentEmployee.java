package hierarchicalInherotance;

public class PermanentEmployee extends EmployeeInherite
{
	protected double providentFund;
	
	public PermanentEmployee(int employeeId,String name,double salary )
	{
		super(employeeId,name,salary);
		this.providentFund=salary*12/100;	
	}
	
	
	public void netSalary()
	{
		double netSalary= providentFund+employeeSalary;
		System.out.println("Net Salary is:"+netSalary);
	}

	
	
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentFund=" + providentFund + "]";
	}
	
	
}


