package assignment1.first;

public class CalculateWage {
    public static void main(String[] args) {
        int wagePrHour = 20;
        int dailyFullHour = 8;
        boolean isPresent = true;
        boolean isAbsent = false;
        if (Math.floor(Math.random() * 2) == 1){
            int employeeDailyWage = (wagePrHour * dailyFullHour);
            System.out.println("Employee Daily Wage is : " + employeeDailyWage);
        }
    }
}
