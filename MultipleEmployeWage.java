package assignment9;

import java.util.Scanner;

import com.sun.source.tree.ContinueTree;

public class MultipleEmployeWage {
	public int wagePrHour;
	public int totalWorkingDay;
    public int totalWorkHour;
	public int workingDay = 0;
	public int workingHour = 0;
	public int Attendence() {
		int attendence = (int)Math.floor(Math.random()*10)%2;
		if (attendence == 0) {
			int is_Present;
		}else {
			int is_Absent;
		}
		return attendence;
	}
	public int SwitchCase(int check) {
		int workHour = 0;
		switch (check){
		case 0 :
			workHour = workHour + 4;
			break;
		case 1 :
			workHour = workHour + 8;
			break;
		
		default:
			break;
		}
		return workHour;
	}
	public int WorkingHour(int workingHour,int totalWorkHour,int workingDay,int totalWorkingDay,int workHour) {
		while (workingHour == totalWorkHour || workingDay == totalWorkingDay){
			workingDay++;
			workingHour = (workingHour + workHour);
		}
		return workingHour;
	}
	public int Check(int attendence) {

		int check = (int) Math.floor(Math.random() * 2);
		if (check == 0){
			System.out.println("PartTime Employee");
		}else {
			System.out.println("FullTime Employee");
		}
		return check * attendence;
	}
	public void Calculate(int wagePrHour,int workHour,int totalWorkHour) {
		int employedailyWage = (wagePrHour * workHour);
		int employeMonthlyWage = (employedailyWage * totalWorkHour);
		System.out.println("Employee Monthly Wage is :" + employeMonthlyWage);
	}

	public static void main(String[] args) {
		
		MultipleEmployeWage obj = new MultipleEmployeWage();
		Scanner sc = new Scanner(System.in);
		int choose = 0;
		while(choose != 1) {
			System.out.println("Welcome To Employee Wage Computation..!!");
			System.out.println("Enter Company Name :: ");
			String company = sc.next();
			System.out.println("Enter Wage per Hour ::");
			obj.wagePrHour = sc.nextInt();
			System.out.println("Enter Total Work Hour for month ::");
			obj.totalWorkHour = sc.nextInt();
			System.out.println("Enter Total Working days per Month ::");
			obj.totalWorkingDay = sc.nextInt();
			
			obj.WorkingHour(obj.workingHour, obj.totalWorkHour, obj.workingDay,obj.totalWorkingDay, obj.totalWorkHour);
		
			System.out.println("-------------------++++++----------------");
			System.out.println("Company Name :: " + company);
			int workHr = obj.SwitchCase( obj.Check(obj.Attendence()));
			obj.Calculate(obj.wagePrHour, workHr,obj.totalWorkHour);
			System.out.println("-------------------++++++----------------");
			System.out.println("Want to continue To calculate Yes or No Press 0 or 1:: ");
			choose = sc.nextInt();
			
			
		}


	}

}


