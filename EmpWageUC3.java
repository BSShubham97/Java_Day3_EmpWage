public class EmpWageUC3 {
    public static void main (String[] args){

        System.out.println("WAGE PER HOUR IS 20 & MAXIMUM WORK HOURS IS 8 ");
        int emp_work_time;
        emp_work_time = (int)(Math.random()*10) %9 ;
        System.out.println("Work Time of Employee:"+emp_work_time+" hrs");
        if (emp_work_time<=4) {
            System.out.println("Employee is a part timer");
        }
            int total_pay = emp_work_time * 20;
        System.out.println("Total wage of the Employee: "+total_pay);
    }
}
