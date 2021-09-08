package assignment1.first;

    public class MonthlyWage {
        public static void main(String[] args) {
            int wagePrHour = 20;
            int totalWorkingDay = 20;
            int workHour = 0;
            int totalWorkHour = 100;
            int workingDay = 0;
            int workingHour = 0;
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
            }
            while (workingHour == totalWorkHour || workingDay == totalWorkingDay){
                workingDay++;
                workingHour = (workingHour + workHour);
            }

                int employedailyWage = (wagePrHour * workHour);
                int employeMonthlyWage = (employedailyWage * totalWorkHour);
                System.out.println("Employee Monthly Wage is :" + employeMonthlyWage);


        }
    }


