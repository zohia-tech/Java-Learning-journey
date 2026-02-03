public class variableType {  // class named variableType
    public void localVariable() {  
        String name = "Ben";        // local variable to store name
        int marks = 95;             // local variable to store marks
        System.out.println(name + " Scored " + marks + "%."); // print name and marks
    }

    public static void main(String[] args) {  
        variableType vt = new variableType(); // create object of class
        vt.localVariable();                   // call the method to print details
    }
}
