public class Nested {  // class named Nested
    public static void main(String[] args) {  
        String name = "Mohan";   // local variable storing name
        int Roll = 25;           // local variable storing roll number
        int marks = 85;          // local variable storing marks

        if (name.equals("Mohan") && Roll == 25) {  // outer if: check name and roll
            if (marks > 35) {                      // nested if: check marks
                System.out.println("Mohan has been promoted to next class."); // print if marks > 35
            } else {
                System.out.println("Mohan needs to give re-exam.");           // print if marks <= 35
            }
        }
    }
}
