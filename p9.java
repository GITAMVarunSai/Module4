class Fibonacci {
    Fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

class p9 {
    public static void main(String[] args) {
        new Fibonacci(10);
    }
}
