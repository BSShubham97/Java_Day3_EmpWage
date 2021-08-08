public class EmpWageUC4 {
    public static void main(String[] args) {
        System.out.println("WAGE PER HOUR IS 20 & MAXIMUM WORK HOURS IS 8 ");
        /*  For fulltime_employee = 2;
         halftime_employee = 1; */
        int emp_hrs=0 ;
        int emp_check;
        emp_check = (int) (Math.random() * 10) % 3;

        int time = emp_check;
        switch (time) {
            case 2:
                System.out.println("Employee is a full time worker");
                emp_hrs = 8;
                break;
            case 1:
                System.out.println("Employee is a part time worker");
                emp_hrs = 4;
                break;
            case 0:
                System.out.println("Employee data unavailable ");
                emp_hrs = 0;
                break;
        }
        int total_pay = emp_hrs * 20;


        System.out.println("Total wage of the Employee: " + total_pay);
    }
}