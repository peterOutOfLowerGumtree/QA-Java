public class RunnerClass {

	public static void main(String[] args) {
		Garage g = new Garage();
		Car car1 = new Car(1, 4, 4, true);
		Car car2 = new Car(2, 5, 3, false);
		g.vehicleList.add(car1);
		g.vehicleList.add(car2);

		Bike bike1 = new Bike(3, 1, true, false);
		Bike bike2 = new Bike(4, 1, false, false);
		g.vehicleList.add(bike1);
		g.vehicleList.add(bike2);

		Train train1 = new Train(5, 30, true, true);
		Train train2 = new Train(6, 35, true, false);
		g.vehicleList.add(train1);
		g.vehicleList.add(train2);

		// Select Vehicle, calculate cost if broken
		g.calcPrice(1);

		// Remove specific vehicle by id
		System.out.println(g.removeVehicleById(3));

		// Remove specific vehicles by type
		System.out.println(g.removeVehicleByType("Car"));

		// Remove all vehicles
		// g.removeAllVehicles();

		g.shitOutList();
	}
}
