package ep12;

public abstract class TaxCalculator {
	protected int price;
	public void setPrice(int price) {
		this.price = price;
	}
//	public int getResult() {
//		return 0;
//	}
	public abstract int getResult();
	
}
