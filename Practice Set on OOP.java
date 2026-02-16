class OOPPracticeSet {

    public static void main(String[] args) {

        Person p1 = new Person("Sara", 20);
        p1.show();

        Person p2 = new Person("Ahmed", 25);
        p2.show();
    }
}

class Person {
    String name;
    int age;

    Person(String n, int a) {   // constructor
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
