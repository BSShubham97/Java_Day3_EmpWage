public class EmpWageUC5 {
    public static void main(String[] args) {
        System.out.println("WAGE PER HOUR IS 20 & MAXIMUM WORK HOURS IS 8 & MAX WORK DAYS ARE 20 ");
        /*  For employee_present = 1;
         employee_absent = 0; */
        int i ;
        int emp_check;
        int emp_work_time;
        int total_work_time=0;

        for(i=1;i<=20;i++) //Repeating the loop for 20 days
        {   System.out.println("DAY:"+i);
            emp_check = (int) (Math.random() * 10) % 2;
            int attend = emp_check;

            switch (attend) {
                case 1:
                    emp_work_time = (int) (Math.random() * 10) % 9;
                    total_work_time = total_work_time + emp_work_time;
                    System.out.println("This days work time: "+emp_work_time);
                    break;
                case 0:
                    emp_work_time = 0;
                    total_work_time = total_work_time + emp_work_time;
                    System.out.println("This days work time: "+emp_work_time);
                    break;

            }
        }
        System.out.println("Total working hours: "+total_work_time+"hrs");
        int total_pay = total_work_time * 20;


        System.out.println("Total wage of the Employee: " + total_pay);
    }
}
