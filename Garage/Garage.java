import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
	public ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void shitOutList() {
		for (Vehicle v : vehicleList) {
			System.out.println(v);
		}
	}

	// Calculate Price
	public void calcPrice(int calcId) {
		if (calcId > vehicleList.size() || calcId < 1)
			System.out.println("NO VEHICLE IN SLOT");
		else {
			for (Vehicle v : vehicleList) {
				if (v.getId() == calcId && v.isBroken)
					System.out.println(v.getType() + " Repair Costs £" + v.getCostOfRepair());
				else if (v.getId() == calcId && !v.isBroken)
					System.out.println(v.getType() + " is fixed");
			}
		}
	}

	// Add Vehicles
	public void addCar(Car c) {
		vehicleList.add(c);
	}

	public void addBike(Bike b) {
		vehicleList.add(b);
	}

	public void addTrain(Train t) {
		vehicleList.add(t);
	}

	// Remove Vehicles by ID
	public String removeVehicleById(int remov) {
		String s = "";
		if (remov < 1)
			s = "NO VEHICLE WITH THIS ID";
		else if (remov > vehicleList.size())
			s = "NO VEHICLE WITH THIS ID";
		else if (remov <= vehicleList.size() || remov >= 1)
			vehicleList.remove(remov - 1);
		else {
			s = "NO VEHICLE WITH THIS ID";
		}
		return s;
	}

	// Remove Vehicles by Type
	public String removeVehicleByType(String remov) {
		String s = "";
		for (Iterator<Vehicle> iter = vehicleList.iterator(); iter.hasNext();) {
			Vehicle v = iter.next();
			if (remov.equals("Car") && v instanceof Car) {
				iter.remove();
			} else if (remov.equals("Bike") && v instanceof Bike) {
				iter.remove();
			} else if (remov.equals("Train") && v instanceof Train) {
				iter.remove();
			}
			else s = "NO VEHICLE OF THAT TYPE LEFT";
		}
		return s;
	}

	// Remove All Vehicles
	public void removeAllVehicles() {
		vehicleList.clear();
	}
}
