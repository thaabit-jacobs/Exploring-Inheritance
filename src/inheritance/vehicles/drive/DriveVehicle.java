package inheritance.vehicles.drive;

import inheritance.vehicles.Vehicles;
import inheritance.vehicles.car.Car;
import inheritance.vehicles.car.SportsCar;
import inheritance.vehicles.truck.Truck;

public class DriveVehicle {
	
	public String driveVehicle(Vehicles vehicle) {
		return "Driving vehicle...";
	}
	
	public String driveCar(Car car) {
		return "Driving car...";
	}
	
	public String driveSportsCar(SportsCar sportsCar) {
		return "Driving sportscar...";
	}
	
	public static void main(String[] args) {
		DriveVehicle dv = new DriveVehicle();
		
		Vehicles v1 = new Vehicles();
		Vehicles c2 = new Car();
		Vehicles sp2 = new SportsCar();
		
		Car c1 = new Car();
		Car sp3 = new SportsCar();
		
		SportsCar sp1 = new SportsCar();
		
		System.out.println(dv.driveVehicle(v1));
		System.out.println(dv.driveVehicle(c2));
		System.out.println(dv.driveVehicle(sp2));

		System.out.println(dv.driveVehicle(c1));
		System.out.println(dv.driveVehicle(sp3));
		
		System.out.println(dv.driveVehicle(sp1));
		
		System.out.println(" ");
		
		//System.out.println(dv.driveCar(v1));
		System.out.println(dv.driveCar((Car)c2));
		System.out.println(dv.driveCar((Car)sp2));
		
		System.out.println(dv.driveCar(c1));
		System.out.println(dv.driveCar(sp3));
		
		System.out.println(dv.driveCar(sp1));
		
		System.out.println(" ");
		
		System.out.println(dv.driveSportsCar((SportsCar)sp2));
		System.out.println(dv.driveSportsCar((SportsCar)sp3));
		System.out.println(dv.driveSportsCar(sp1));
	}
}
