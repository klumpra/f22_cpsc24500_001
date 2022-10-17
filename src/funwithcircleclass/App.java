package funwithcircleclass;

public class App {

	public static void main(String[] args) {
		Circle defCirc = new Circle();
		double area = defCirc.findArea();
		double circ = defCirc.findCircumference();
		System.out.printf("Area is %.2f and circ is %.2f.\n",area,circ);
		defCirc.setRadius(5);
		area = defCirc.findArea();
		circ = defCirc.findCircumference();
		System.out.printf("Area is %.2f and circ is %.2f.\n",area,circ);
		
	}

}
