package soal1;

public abstract class Shape {
	protected String shapeName;
	
	public Shape (String Nama) {
		shapeName = Nama;
	}
	
	public abstract double area();
	
	public String toString() {
		return shapeName;
	}
}