class AccessModifierExample {

    public static void main(String[] args) {

        Employee e1 = new Employee(); // Creating object of Employee class

        e1.setName("Zain");      // Setting name using setter method
        e1.setSalary(30000);    // Setting salary using setter method

        // Getting values using getter methods
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
    }
}

class Employee {

    private String name;   // Private variable (cannot be accessed directly)
    private int salary;    // Private variable

    // Setter method to set name
    public void setName(String n) {
        name = n;
    }

    // Setter method to set salary
    public void setSalary(int s) {
        salary = s;
    }

    // Getter method to return name
    public String getName() {
        return name;
    }

    // Getter method to return salary
    public int getSalary() {
        return salary;
    }
}
