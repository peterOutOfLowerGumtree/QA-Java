import static org.junit.Assert.*;
import org.junit.Test;

public class GarageTest {
	@Test
	public void carCreationTest() {
		Car c = new Car(1, 1, 1, false);
		assertNotNull(c);
	}

	@Test
	public void getterTest() {
		Car c = new Car(1, 1, 1, false);
		assertEquals(1, c.getId());
		assertEquals("Car", c.getType());
		assertEquals(1, c.getNumberOfDoors());
		assertEquals(1, c.getNumberOfSeats());
		assertEquals(100, c.getCostOfRepair());
		assertEquals(false, c.getIsBroken());
	}

	@Test
	public void setterTest() {
		Car c = new Car(1, 1, 1, false);
		c.setId(2);
		c.setType("Jet");
		c.setNumberOfSeats(2);
		c.setCostOfRepair(150);
		c.setBroken(true);
		c.setNumberOfDoors(2);
		assertEquals(2, c.getId());
		assertEquals(true, c.getBroken());
	}
	
	@Test
	public void addToGarageTest(){
		Garage g = new Garage();
		Car c = new Car(1, 1, 1, false);
		g.vehicleList.add(c);
		assertEquals(g.vehicleList.size(),1);
	}
	
	@Test
	public void removeByIdTest1(){
		Garage g = new Garage();
		Car c = new Car(1, 1, 1, false);
		g.vehicleList.add(c);
		String result = g.removeVehicleById(0);
		assertEquals("NO VEHICLE WITH THIS ID",result);
	}
	
	@Test
	public void removeByIdTest2(){
		Garage g = new Garage();
		Car c = new Car(1, 1, 1, false);
		g.vehicleList.add(c);
		String result = g.removeVehicleById(2);
		assertEquals("NO VEHICLE WITH THIS ID",result);
	}
	
	@Test
	public void removeByIdTest3(){
		Garage g = new Garage();
		Car c = new Car(1, 1, 1, false);
		g.vehicleList.add(c);
		g.removeVehicleById(1);
		assertEquals(g.vehicleList.size(),0);
	}
	
	@Test
	public void removeByTypeTest1(){
		Garage g = new Garage();
		Car c = new Car(1, 1, 1, false);
		g.vehicleList.add(c);
		g.removeVehicleByType("Car");
		assertEquals(g.vehicleList.size(),0);
	}
	@Test
	public void removeByTypeTest2(){
		Garage g = new Garage();
		Car c = new Car(1, 1, 1, false);
		g.vehicleList.add(c);
		String result = g.removeVehicleByType("TANK");
		assertEquals("NO VEHICLE OF THAT TYPE LEFT",result);
	}
	
	@Test
	public void removeAllTest(){
		Garage g = new Garage();
		Car c = new Car(1, 1, 1, false);
		g.vehicleList.add(c);
		g.removeAllVehicles();
		assertEquals(g.vehicleList.size(),0);
	}
}
