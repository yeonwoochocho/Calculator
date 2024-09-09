package week03;

public class Car {
    //필드
    //고유 데이터 영역
    String company;
    String model = "Gv80";
    String color;
    double price;
    //상태 데이터 영역
    double speed;
    char gear;
    boolean lights = true;

    //객체 데이터 영역
    Tire tire = new Tire(); //인스턴스화
    Door door;
    Handle handle;
    //생성자
    public Car() {
        //기본 생성자 생략 가능
        System.out.println("생성자가 호출되었습니다 객체가 생성됩니다.");
    }

    //메서드
    public double gasPedal(double kmh, char type){
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type){
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn(){
        System.out.println("빵빵");
    }

    void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v = " + v);
        }
    }


}
