package assignment8;

public class EmployeWage_Refactor {
	public void Attendence() {
		if (Math.floor(Math.random()*10)%2 == 0) {
			int is_Present;
		}else {
			int is_Absent;
		}
	}
	public int SwtchCase(int check) {
		int workHour = 0;
		switch (check){
        case 0 :
            workHour = workHour + 4;
            break;
        case 1 :
            workHour = workHour + 8;
            break;
        case 2 :
        	workHour = 0;
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
		 
		 int check = (int) Math.floor(Math.random() * 3);
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
         int wagePrHour = 20;
         int totalWorkingDay = 20;
         
         int totalWorkHour = 100;
         int workingDay = 0;
         int workingHour = 0;
        EmployeWage_Refactor obj = new EmployeWage_Refactor();
       int workHr = obj.SwtchCase( obj.Check(obj.Attendence()));
        obj.WorkingHour(workingHour, totalWorkHour, workingDay, totalWorkingDay, totalWorkHour);
        obj.Calculate(wagePrHour, workHr, totalWorkHour);
             


     }

}
