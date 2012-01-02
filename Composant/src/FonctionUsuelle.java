import java.lang.Math;

public class FonctionUsuelle extends Composant {

	public double puissance(double x, double y) {
		return Math.pow(x, y);
	}

	public double exponentielle(double x) {
		return Math.exp(x);
	}

	public double logarithme(double x) {
		return Math.log(x);
	}

	public double factorielle(double x) {
		int fact = 1;
        for (int i=1; i <= x; i++) {
            fact = fact * i;
        }
		return x;
	}

	public double cos(double x) {
		return Math.cos(x);
	}

	public double sin(double x) {
		return Math.sin(x);
	}

	public double tan(double x) {
		return Math.tan(x);
	}

	public double acos(double x) {
		return Math.acos(x);
	}

	public double arrondi(double x) {
		return Math.round(x);
	}

	public double min(double x, double y) {
		if(x > y){
			return y;
		} else {
			return x;
		}
	}

	public double max(double x, double y) {
		if(x < y){
			return y;
		} else {
			return x;
		}
	}

	public double absolue(double x) {
		return Math.abs(x);
	}

}