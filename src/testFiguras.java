
public class testFiguras {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo ("Triangulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new Triangulo ("Triangulo t2", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Cuadrado 1", 127);
		Rectangulo r1 = new Rectangulo("Rectangulo 1", 20.0, 40.0);
		Rombo rom1 = new Rombo("Rombo 1", 20.0, 40.0, 10.0);
		Romboide romboide1 = new Romboide("Romboide 1", 20.0, 40.0);
		Trapecio tra1 = new Trapecio("Trapecio", 20.0, 40.0, 30.0, 25.0, 10.0, 50.0, 15.0);
		imprimirCalculo(t1);imprimirCalculo(t2);
		imprimirCalculo(c1);
		imprimirCalculo(r1);
		imprimirCalculo(rom1);
		imprimirCalculo(romboide1);
		imprimirCalculo(tra1);
	}//main

	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("====================================================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() +
					"\n" + "|El perimetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("====================================================================");
	}
	
	
}//class testFiguras
