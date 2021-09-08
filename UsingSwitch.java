package assignment1.first;

public class UsingSwitch {
    public static void main(String[] args) {
        int wagePrHour = 20;
        int workHour = 0;

        int check = (int) Math.floor(Math.random() * 2);
        if (check == 0){
            System.out.println("PartTime Employee");
        }else {
            System.out.println("FullTime Employee");
        }
        switch (check){
            case 0 :
                workHour = workHour + 4;
                break;
            case 1 :
                workHour = workHour + 8;
            default:
                System.out.println("Invalid");
        }
        int employedailyWage = (wagePrHour * workHour);
        System.out.println("Employee Daily Wage is :" + employedailyWage);

    }
}
