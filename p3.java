class Member {
    String name, phoneNumber, address;
    int age;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

class p3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "John";
        e.salary = 50000;
        e.printSalary();
    }
}
