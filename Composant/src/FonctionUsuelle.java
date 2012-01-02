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

	public void cos() {
		throw new UnsupportedOperationException();
	}

	public void sin() {
		throw new UnsupportedOperationException();
	}

	public void tan() {
		throw new UnsupportedOperationException();
	}

	public void acos() {
		throw new UnsupportedOperationException();
	}

	public void arrondi() {
		throw new UnsupportedOperationException();
	}

	public void min() {
		throw new UnsupportedOperationException();
	}

	public void max() {
		throw new UnsupportedOperationException();
	}

	public void absolue() {
		throw new UnsupportedOperationException();
	}

}