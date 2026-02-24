class AccessAndConstructorPractice {

    public static void main(String[] args) {

        // -------- Practice 1: Student --------
        Student s1 = new Student("Ali", 18);
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());

        s1.setName("Ahmed");
        s1.setAge(20);
        System.out.println("Updated Name: " + s1.getName());
        System.out.println("Updated Age: " + s1.getAge());

        System.out.println("--------------------");

        // -------- Practice 2: Car --------
        Car c1 = new Car("Honda", 2022);
        Car c2 = new Car("Toyota", 2024);

        c1.display();
        c2.display();

        System.out.println("--------------------");

        // -------- Practice 3: BankAccount --------
        BankAccount acc = new BankAccount(5000);
        System.out.println("Bank Balance: " + acc.getBalance());

        System.out.println("--------------------");

        // -------- Practice 4: Teacher --------
        Teacher t1 = new Teacher();
        t1.show();
    }
}

// ---------- Practice 1: Student (private + getter/setter + constructor) ----------
class Student {
    private String name;
    private int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }
}

// ---------- Practice 2: Car (constructor) ----------
class Car {
    String brand;
    int model;

    Car(String b, int m) {
        brand = b;
        model = m;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
    }
}

// ---------- Practice 3: BankAccount (private + constructor + getter) ----------
class BankAccount {
    private int balance;

    BankAccount(int b) {
        balance = b;
    }

    public int getBalance() {
        return balance;
    }
}

// ---------- Practice 4: Teacher (default constructor) ----------
class Teacher {
    String name;

    Teacher() {
        name = "Unknown";
    }

    void show() {
        System.out.println("Teacher Name: " + name);
    }
}
