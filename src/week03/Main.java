package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("페달 밟기 전 car.gear = "+ car.gear);


        double speed = car.gasPedal(100,'D');
        System.out.println("speed = "+ speed);

        boolean lights = car.onOffLights();
        System.out.println("Lights = "+ lights);

        System.out.println();
        System.out.println("밟고 난 후 car.gear = "+ car.gear);

        System.out.println();
        car.carSpeeds(100, 80);

        System.out.println();
        car.carSpeeds(110, 120, 150);


    }
}
