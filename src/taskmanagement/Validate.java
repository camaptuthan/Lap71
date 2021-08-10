package taskmanagement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validate {

    Scanner sc = new Scanner(System.in);

    public int checkInt(String mess, int min, int max) {
        int number;
        do {
            try {
                System.out.print(mess);
                number = Integer.parseInt(sc.nextLine());
                if (number >= min && number <= max) {
                    break;
                } else {
                    System.out.println("Please enter in range [" + min + ", " + max + "]");
                }
            } catch (Exception e) {
                System.out.println("Invalidate");
            }
        } while (true);
        return number;
    }
    
    public String checkInputString() {
        while (true) {
            String result = sc.nextLine();
            if (result.trim().length() == 0) {
                System.err.println("Re-input : ");
            } else {
                return result;
            }
        }
    }
    public String checkInputTypeId(){
        while (true) {            
            int n = checkInt("Enter Task Type: ", 1, 4);
            String result = null;
            switch(n){
                case 1:
                    result = "Code";
                    break;
                case 2:
                    result = "Test";
                    break;
                case 3:
                    result = "Design";
                    break;
                case 4:
                    result = "Review";
                    break;
            }
            return result;
        }
    }
    public String checkDate() {
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        date.setLenient(false);
        while (true) {
            try {
                Date dt = date.parse(sc.nextLine());
                return new SimpleDateFormat("dd-MM-yyyy").format(dt);
            } catch (Exception e) {
                System.err.println("Re-input: ");
            }
        }
    }
    
    public double checkInputDouble() {
        double number;
        do {
            try {
                number = Double.parseDouble(sc.nextLine());
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Please enter more than 0");
                }
            } catch (Exception e) {
                System.out.println("Invalidate");
            }
        } while (true);
        return number;
    }
     public boolean checkTime(double time) {
        if (time >= 8.0 && time <= 17.5) {
            if (time - (int) time == 0 || time - (int) time == 0.5) {
                return true;
            }
        }
        return false;
    }
    
    public double checkPlanFrom(){
        while (true) {            
            try {
                double from = checkInputDouble();
                if(checkTime(from)){
                    return from;
                }else{
                    System.out.println("PlanFrom must be in range 8.0 to 17.5");
                }
            } catch (Exception e) {
                System.out.println("Re-enter: ");
            }
        }
    }
    
    public double checkPlanTo(double from){
          while (true) {            
            try {
                double to = checkInputDouble();
                if(checkTime(to) && to >= from){
                    return to;
                }else{
                    System.out.println("PlanTo must be in range 8.0 to 17.5");
                }
            } catch (Exception e) {
                System.out.println("Re-enter: ");
            }
        }
    }
}
