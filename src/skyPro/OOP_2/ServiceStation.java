package skyPro.OOP_2;

public class ServiceStation {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        checkAnything(car);
        checkAnything(bicycle);
        checkAnything(truck);
    }
    public void checkAnything(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.modelName);
            for (int i = 0; i < transport.wheelsCount; i++) {
                transport.updateTyre();
            }
            if (transport.getClass() == Car.class) {
                Car car1 = (Car) transport;
                car1.checkEngine();
                car1 = null;
            }
            if (transport.getClass() == Truck.class) {
                Truck truck1 = (Truck) transport;
                truck1.checkEngine();
                truck1.checkTrailer();
                truck1 = null;
            }
        }
    }
}