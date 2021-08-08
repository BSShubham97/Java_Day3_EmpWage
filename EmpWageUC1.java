public class EmpWage_UC1 {
    public static void main(String[] args) {

        System.out.println("Program to check if the employee is present or absent");
        double emp_check = Math.floor((Math.random()*10) %2);   //MATH.random() gives out a decimal point number
            if ( emp_check == 1 )
                    System.out.println("Employee is present");
            else
                    System.out.println("Employee is absent");
    }
    }



