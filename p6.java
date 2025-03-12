abstract class Telephone {
    abstract void call();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    void call() {
        System.out.println("Calling...");
    }

    void lift() {
        System.out.println("Lifted");
    }

    void disconnect() {
        System.out.println("Disconnected");
    }
}

class p6 {
    public static void main(String[] args) {
        Telephone t = new SmartTelephone();
        t.call();
        t.lift();
        t.disconnect();
    }
}
