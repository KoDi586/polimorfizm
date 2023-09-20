package skyPro.OOP_2;

public class Car extends Transport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public Car() {

    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
