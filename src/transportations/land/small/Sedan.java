package transportations.land.small;

import transportations.air.Plane;
import transportations.land.Car;

public class Sedan extends Car {

	public Sedan() {
		// TODO Auto-generated constructor stub
		super.move();
	}
	
	public String fly() {
		Plane plane = new Plane();
		return plane.fly();
	}

}
