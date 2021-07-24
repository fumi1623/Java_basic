package ep11;

public class CarA extends Car {
	@Override
	public void drive() {
		System.out.println("CarA runs");
	}
	public void stop() {
		System.out.println("CarA stops");
	}
	public void turn() {
		System.out.println("CarA turns");
	}
}
