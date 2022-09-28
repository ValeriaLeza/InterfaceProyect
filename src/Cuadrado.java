public class Cuadrado implements FiguraGeometrica {
	private String name;
	private double lado;
	
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}//contructor
	
	public double calcularArea() {
		return (getLado()* getLado());
	}
	public double calcularPerimetro() {
		return (getLado()+ getLado()+ getLado()+ getLado());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}
	
}//class Cuadrado

