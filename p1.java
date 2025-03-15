class P1 {
    double x, y;

    P1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static double distance(P1 p1, P1 p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public static void main(String[] args) {
        P1 p1 = new P1(3, 4);
        P1 p2 = new P1(6, 8);
        System.out.println("Distance: " + distance(p1, p2));
    }
}
