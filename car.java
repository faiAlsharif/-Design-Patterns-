// Vehicle.java - Factory Pattern Implementation for Vehicle Assembly System

// The Vehicle interface that must be implemented by all vehicle types
public interface Vehicle {
    void getSpecifications();
}

// Subclasses representing different types of vehicles
class Car implements Vehicle {
    @Override
    public void getSpecifications() {
        System.out.println("Car: 4 doors, 5 seats, Petrol Engine.");
    }
}

class Truck implements Vehicle {
    @Override
    public void getSpecifications() {
        System.out.println("Truck: 2 doors, Large cargo capacity, Diesel Engine.");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void getSpecifications() {
        System.out.println("Motorcycle: 0 doors, 2 wheels, Compact Engine.");
    }
}

// Vehicle Factory interface for creating vehicles
interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete factory for creating Cars
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

// Concrete factory for creating Trucks
class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}

// Concrete factory for creating Motorcycles
class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

// Main Method to test the code
public class VehicleAssemblySystem {
    public static void main(String[] args) {
        // Create factories for each vehicle type
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        // Create vehicles using the factories
        Vehicle car = carFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();
        Vehicle motorcycle = motorcycleFactory.createVehicle();

        // Print the specifications of each vehicle
        car.getSpecifications();
        truck.getSpecifications();
        motorcycle.getSpecifications();
    }
}