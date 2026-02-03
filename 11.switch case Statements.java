public class JavaSwitch {  // class named JavaSwitch
    public static void main(String[] args) {  
        String day = "Wednesday";  // variable storing day of the week

        switch (day) {  // switch statement to match day
            case "Sunday":                    // if day is Sunday
                System.out.println("Today is Sunday");  // print message
                break;                          // exit switch
            case "Monday":                    // if day is Monday
                System.out.println("Today is Monday");
                break;
            case "Tuesday":                   // if day is Tuesday
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":                 // if day is Wednesday
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":                  // if day is Thursday
                System.out.println("Today is Thursday");
                break;
            case "Friday":                    // if day is Friday
                System.out.println("Today is Friday");
                break;
            case "Saturday":                  // if day is Saturday
                System.out.println("Today is Saturday");
                break;
        }
    }
}
