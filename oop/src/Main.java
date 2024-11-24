class Car{
    public void speedUp(){
        System.out.println("Speed up");
    }
    public void slowDown(){
        System.out.println("Slow down");
    }
}
class BMW extends Car{
    @Override
    public void speedUp() {
        System.out.println("BMW is speeding up");
    }

    @Override
    public void slowDown() {
        System.out.println("BMW is slowing down");
    }
}
class Ford extends Car{
    @Override
    public void speedUp() {
        System.out.println("Ford is speeding up");
    }

    @Override
    public void slowDown() {
        System.out.println("Ford is slowing down");
    }
}


public class Main {
    public static void main(String[] koko) {
        Car ford = new Ford();
        Car bmw = new BMW();
        ford.slowDown();
        ford.speedUp();
        bmw.speedUp();
        bmw.slowDown();
    }
}
