import java.util.Scanner;

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("브랜드 입력 :");
        String brand = sc.next();
        System.out.println("스피드 입력 :");
        int speed = sc.nextInt();
        student Mystudent = new student();
        Mystudent.age = 23;
        Mystudent.name = "심찬민";
        Mystudent.info();

        Car Mycar = new Car(brand, speed);
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
