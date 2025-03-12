class Shape {
    double dimension;

    Shape() {}

    Shape(double dimension) {
        this.dimension = dimension;
    }
}

class p2 extends Shape {
    p2() {
        super();
    }

    p2(double dimension) {
        super(dimension);
    }

    void calculate() {
        System.out.println("Volume: " + (dimension * dimension * dimension));
    }

    public static void main(String[] args) {
        p2 t = new p2(5);
        t.calculate();
    }
}
