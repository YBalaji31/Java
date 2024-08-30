interface Drivable {
    void accelerate();
    void brake();
}

interface Fuelable {
    void refuel(int litres);
}

class Car implements Drivable, Fuelable {
    private String model;
    private int fuelLevel;

    public Car(String model) {
        this.model = model;
        this.fuelLevel =10;
    }

    
    public void accelerate() {
        System.out.println(model + " car accelerating.");
    }


    public void brake() {
        System.out.println(model + " car braking.");
    }

    public void refuel(int litres) {
        fuelLevel += litres;
        System.out.println(model + " car refueled. Fuel level: " + fuelLevel);
    }
	
	
	public static void main(String[] args){
		
		Car car=new Car("Ford-21");
		car.accelerate();
		car.brake();
		car.refuel(20);
		car.accelerate();
		
	}
}

