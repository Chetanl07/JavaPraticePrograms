package hierarchicalInherotance;

public class ContractEmployee extends EmployeeInherite {
	
	protected int contractDuration;
	
	public ContractEmployee(int id,String name,double salary,int contractDuration )
	{
		super (id,name,salary);
		this.contractDuration=contractDuration;
		
	}

	@Override
	public String toString() {
		return "ContractEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary = "
				+ employeeSalary + ", contractDuration=" + contractDuration + "]";
	}
	
	
	

}
