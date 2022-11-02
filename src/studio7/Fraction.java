package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		this.numerator = initNumerator;
		this.denominator = initDenominator;
	}
		
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}
	
	public Fraction simplify() {
		int num = this.numerator;
		int den = this.denominator;
		for(int i=2; i<=num; i++) {
			while(num%i==0 && den%i==0) {
				num = num/i;
				den = den/i;
			}
		}
		return new Fraction(num, den);
	}
	
	public Fraction add(Fraction fraction2) {
		int num = this.numerator*fraction2.denominator + fraction2.numerator*this.denominator;
		int den = this.denominator*fraction2.denominator;
		return new Fraction(num, den);
	}
	
	public Fraction multiply(Fraction fraction2) {
		int num = this.numerator*fraction2.numerator;
		int den = this.denominator*fraction2.denominator;
		return new Fraction(num,den);
	}
	
	public Fraction reciprocal() {
		return new Fraction(this.denominator, this.numerator);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction thing1 = new Fraction(4, 6);
		System.out.println(thing1.simplify());
	}

}
