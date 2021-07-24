package ep12;

public class CarA implements Car {
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
