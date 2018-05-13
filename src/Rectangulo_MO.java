/**
 * 
 * @author Mindaugas Ozeraitis
 * @version 1.1
 */
public class Rectangulo_MO extends FiguraGeometrica_MO {
	private double l1;
	private double l2;
	
	public Rectangulo_MO(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 *  Este metodo calcula el area del rectangulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Este metodo calcula el perimetro del rectangulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
