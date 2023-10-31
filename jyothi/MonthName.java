

public class MonthName {
    public static void main(String[] args) {
      
        int monthNumber = Integer.parseInt(args[0]);
        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            
            default:
                monthName = "Invalid month number";
                break;
        }

        System.out.println("Month name " + monthName);
        
    }
}
