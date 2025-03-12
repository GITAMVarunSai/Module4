class Shape1 {
    void print() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape1 {
    void print() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape1 {
    void print() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void print() {
        System.out.println("Square is a rectangle");
        super.print();
    }
}

class p4 {
    public static void main(String[] args) {
        Square s = new Square();
        s.print();
    }
}
