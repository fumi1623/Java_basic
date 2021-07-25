package ep13;

public class GenericSample <E> {
	private E value;
	public void setValue(E value) {
		this.value = value;
	}
	public E getValue() {
		return this.value;
	}
}

//GenericSample<String> sample = new GenericsSample<>();