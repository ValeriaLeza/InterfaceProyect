public class Rombo implements FiguraGeometrica {
	private String name;
	private double lado;
	private double diagonalmenor;
	private double diagonalmayor;
	
	public Rombo(String name, double lado, double diagonalmenor, double diagonalmayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagonalmenor = diagonalmenor;
		this.diagonalmayor = diagonalmayor;
	}
	
	public double calcularArea() {
		return ((getDiagonalmenor()*getDigonalmayor())/2 );
	}
	public double calcularPerimetro() {
		return (getLado()*4);
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

	public double getDiagonalmenor() {
		return diagonalmenor;
	}

	public void setDiagonalmenor(double diagonalmenor) {
		this.diagonalmenor = diagonalmenor;
	}

	public double getDigonalmayor() {
		return diagonalmayor;
	}

	public void setDigonalmayor(double digonalmayor) {
		this.diagonalmayor = digonalmayor;
	}

	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagonalmenor=" + diagonalmenor + ", digonalmayor="
				+ diagonalmayor + "]";
	}
	
}
