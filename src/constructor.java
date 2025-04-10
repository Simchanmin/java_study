public class constructor {
    public static void main(String[] args) {
        student Mystudent = new student();
        Mystudent.age = 23;
        Mystudent.name = "심찬민";
        Mystudent.info();

        Car Mycar = new Car("도요타", 130);
        Mycar.Nspeed();
        Car Mycar2 = new Car();
        Mycar2.Nspeed();


    }
}

class student {
    String name;
    int age;

    void info() {
        System.out.println(age + "세 " + name + "입니다.");
    }
};

class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    Car() {
        this.brand = "Hundai";
        this.speed = 100;
    }

    void Nspeed() {
        System.out.println("브랜드는: " + brand + " 속도는: " + speed);
    }
}
