public class JavaIf {  // class named JavaIf
    public static void main(String[] args) {  
        String name = "Mohan";   // local variable storing name
        int Roll = 25;           // local variable storing roll number

        if (name.equals("Mohan") && Roll == 26) {  // check if both conditions are true
            System.out.println("Details of Mohan."); // print details if true
        } else {
            System.out.println("Invalid details.");  // print if condition is false
        }
    }
}
