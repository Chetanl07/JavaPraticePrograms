package hierarchicalInherotance;

import java.util.Scanner;

public class ELCEmployeeSystem {

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter permanent Employee id:");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter permanent employee Nmae:");
		String name=sc.nextLine();
		
		System.out.println("Enter permanent employee Salary");
		double salary=Double.parseDouble(sc.nextLine());
		
		
		PermanentEmployee p1=new PermanentEmployee(id, name, salary);
		System.out.println(p1);
		p1.netSalary();
		
		
	}
}
