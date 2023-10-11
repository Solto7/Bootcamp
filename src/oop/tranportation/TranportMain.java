package oop.tranportation;

public class TranportMain {
    public static void main(String[] args) {

        Ship ship = new Ship("Titanic ", 564,false);
        System.out.println(ship.isWork());
        Airplane aieplane = new Airplane("Boieng",737);
        System.out.println(aieplane.driving());
        Train train = new Train("Red",323,700000);
        System.out.println(train.driving());
        Car car = new Car("Bmw",232);
        System.out.println(car.driving());

    }

}
