package transportations.land;

import transportations.land.small.Sedan;

public class Transportation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan = new Sedan();
		System.out.println("Sedan: " + sedan.move());
		System.out.println("Sedan: nge" + sedan.fly());
	}

}
