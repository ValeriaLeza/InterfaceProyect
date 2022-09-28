public class Trapecio implements FiguraGeometrica {
	private String name;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double basemenor;
	private double basemayor;
	private double altura;
	
	public double calcularArea() {
		return (getAltura()*(getBasemenor()*getBasemayor()));
	}
	public double calcularPerimetro() {
		return (getLado1()+getLado2()+getLado3()+getLado4());
	}
	
	public Trapecio(String name, double lado1, double lado2, double lado3, double lado4, double basemenor,
			double basemayor, double altura) {
		super();
		this.name = name;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.basemenor = basemenor;
		this.basemayor = basemayor;
		this.altura = altura;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getLado1() {
		return lado1;
	}


	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}


	public double getLado2() {
		return lado2;
	}


	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	public double getLado3() {
		return lado3;
	}


	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}


	public double getLado4() {
		return lado4;
	}


	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}


	public double getBasemenor() {
		return basemenor;
	}


	public void setBasemenor(double basemenor) {
		this.basemenor = basemenor;
	}


	public double getBasemayor() {
		return basemayor;
	}


	public void setBasemayor(double basemayor) {
		this.basemayor = basemayor;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", basemenor=" + basemenor + ", basemayor=" + basemayor + ", altura=" + altura + "]";
	}
}
