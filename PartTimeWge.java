package assignment1.first;

public class PartTimeWge {
    public static void main(String[] args) {
        boolean isFullTime;
        boolean isPartTime;
        int wagePrHour = 20;
        int workHour = 0;
        if (Math.floor(Math.random() * 2) == 0){
            System.out.println("FullTime Employee");
            workHour = workHour + 8;
        }
        else
        {
            System.out.println("PartTime Employee");
            workHour = workHour+ 4;
        }
        int employedailyWage = (wagePrHour * workHour);
        System.out.println("Employee Daily Wage is :" + employedailyWage);
    }
}
