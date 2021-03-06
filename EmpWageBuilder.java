package employeWadge;


import java.util.Scanner;

public class EmpWageBuilder {
	String company;
	int empWage;

	@Override
	public String toString() {
		return "EmpWageBuilder [company=" + company + ", empWage=" + empWage + "]";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getEmpWage() {
		return empWage;
	}

	public void setEmpWage(int empWage) {
		this.empWage = empWage;
	}

	EmpWageBuilder(String name, int empWage) {

	}

	public static void display(EmpWageBuilder[] build) {
		for(EmpWageBuilder emp:build) {
			System.out.println(emp);
		}


	}

	public static int attendence() {
		int attendence = (int) Math.floor(Math.random() * 10) % 2;
		if (attendence == 0) {
			int present = 0;
		} else {
			int absent = 1;
		}
		return attendence;
	}

	public static int switchCase(int check) {
		int workHour = 0;
		switch (check) {
		case 0:
			workHour = workHour + 4;
			break;
		case 1:
			workHour = workHour + 8;
			break;

		default:
			break;
		}
		return workHour;
	}

	public static int workingHour(int workingHour, int totalWorkHour, int workingDay, int totalWorkingDay,
			int workHour) {
		while (workingHour == totalWorkHour || workingDay == totalWorkingDay) {
			workingDay++;
			workingHour = (workingHour + workHour);
		}
		return workingHour;
	}

	public static int check(int attendence) {
		int fullTime = 0;
		int partTime = 1;
		int check = (int) Math.floor(Math.random() * 2);

		return check * attendence;
	}

	public static int calculate(int wagePrHour, int workHour, int totalWorkHour) {
		int employedailyWage = (wagePrHour * workHour);
		int employeMonthlyWage = (employedailyWage * totalWorkHour);

		return employeMonthlyWage;
	}

	public static void main(String[] args) {

		int wagePrHour;
		int totalWorkingDay;
		int totalWorkHour;
		int workingDay = 0;
		int workingHour = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to calculate companies Wage :: ");
		int number = sc.nextInt();

		EmpWageBuilder[] build = new EmpWageBuilder[number];
		int choose = 0;
		while (choose != 1) {
			for (int i = 0; i < number; i++) {
				System.out.println("Welcome To Employee Wage Computation..!!");
				System.out.println("Enter Company Name :: ");
				String company = sc.next();
				System.out.println("Enter Wage per Hour ::");
				wagePrHour = sc.nextInt();
				System.out.println("Enter Total Work Hour for month ::");
				totalWorkHour = sc.nextInt();
				System.out.println("Enter Total Working days per Month ::");
				totalWorkingDay = sc.nextInt();

				workingHour(workingHour, totalWorkHour, workingDay, totalWorkingDay, totalWorkHour);

				int workHr = switchCase(check(attendence()));
				int empWage = calculate(wagePrHour, workHr, totalWorkHour);
				EmpWageBuilder emp = new EmpWageBuilder(company, empWage);
				emp.setCompany(company);
				emp.setEmpWage(empWage);
				build[i] = emp;

			}

			System.out.println("---------------++++++-------------");
			display(build);
			System.out.println("---------------++++++-------------");

			System.out.println("Want to continue To calculate Yes or No Press 0 or 1:: ");
			choose = sc.nextInt();

		}

		sc.close();
	}

}
