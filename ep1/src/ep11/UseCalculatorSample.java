package ep11;

public class UseCalculatorSample {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
//		calc.setPrice(1000);
//		calc.setQty(3);
//		calc.setTaxCal(new ExciseTax());
		calc.setPrice(5000);;
		calc.setQty(3);
		calc.setTaxCal(new NewTypeTax());
		int result = calc.getResult();
		System.out.println(result);
	}
}
