package ep11;

public class CarB extends Car {
	@Override
	public void drive() {
		System.out.println("CarB runs");
	}
	public void stop() {
		System.out.println("CarB stops");
	}
	public void turn() {
		System.out.println("CarB turns");
	}
}
