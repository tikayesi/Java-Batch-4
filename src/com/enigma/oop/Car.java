package com.enigma.oop;

public class Car {
	private String colour;
    private Boolean isStart;
    private Integer fuel;
    
    
    
    public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void hapusColour() {
		colour = null;
	}

	public Car(String colour){
        this.colour = colour;
        this.fuel = 0;
    }

    public void fillFuel(int fuel){
    	if(fuel>0)
        this.fuel = this.fuel + fuel;
    }
    
    public Integer getFuel() {
    	return this.fuel;
    }
    
    private void engineBeneranStart() {
        System.out.println("Brum brum " + this.fuel);
        this.fuel = this.fuel - 1;
    }

    public void engineStart(){
        if(this.fuel>0){
        	this.engineBeneranStart();
        } else {
            System.out.println("Insufficient fuel");
        }
    }

    public String print() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", isStart=" + isStart +
                ", fuel=" + fuel +
                '}';
    }

}
