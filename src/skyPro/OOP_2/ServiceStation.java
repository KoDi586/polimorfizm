package skyPro.OOP_2;

public class ServiceStation {

    public void check(Transport transport) {
        if (transport != null) {
            transport.service(transport);
            separator();
        }
    }

    public void check(Car car) {
        if (car != null) {
            car.service(car);
            separator();
        }
    }
    public void check(Truck truck) {
        if (truck != null) {
            truck.service(truck);
            separator();
        }
    }

    public void separator() {
        System.out.println("\n-------------------------\n");
    }

}