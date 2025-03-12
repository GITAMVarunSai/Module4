class Parent {
    void print() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("This is child class");
    }
}

class p5 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();
        p.print();
        c.print();
        pc.print();
    }
}
