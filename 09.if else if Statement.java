public class JavaIf {  // class named JavaIf
    public static void main(String[] args) {  
        String name[] = {"Mohan", "Rohan", "Soham"};  // array storing names
        int Roll[] = {25, 36, 71};                     // array storing roll numbers

        if (name[0].equals("Mohan") && Roll[0] == 25) {       // check first student
            System.out.println("Details of Mohan.");          // print if true
        } else if (name[1].equals("Rohan") && Roll[1] == 36) { // check second student
            System.out.println("Details of Rohan.");          // print if true
        } else if (name[2].equals("Soham") && Roll[2] == 71) { // check third student
            System.out.println("Details of Soham.");          // print if true
        } else {
            System.out.println("Invalid details.");           // print if none match
        }
    }
}
