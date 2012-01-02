

public class TestLogique extends Composant {

	public Boolean egalite( double x, double y ) {
		return (x==y);
	}

	public Boolean difference( double x, double y ) {
		return (x!=y);
	}

	public Boolean inferieurStrict( double x, double y ) {
		return (x<y);
	}

	public Boolean superieurStrict( double x, double y ) {
		return (x>y);
	}

	public Boolean inferieurEgal( double x, double y ) {
		return (x<=y);
	}

	public Boolean superieurEgal( double x, double y ) {
		return (x>=y);
	}

}