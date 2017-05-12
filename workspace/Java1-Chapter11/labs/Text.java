package labs;

public class Text implements Drawable{
	
	private String value;

	public Text(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void draw() {
		System.out.println(value);
	}
	
	public void getAreas() {
		System.out.println(value);
	}
}
