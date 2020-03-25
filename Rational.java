package edu.yu.intro.objects.rational;

public class Rational { 

	int numerator, denominator;

	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public void printRational() {
		System.out.println(this.numerator +  "/"  + this.denominator);
	}

	public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }


	public static void main(String[] args) {
		Rational frac1 = new Rational(10, 20);
		Rational frac2 = new Rational(6, 8);
		
		
		
		frac1.printRational();
		
		frac1 = new Rational(10, 20);
		
		frac1.negate();

		frac1.printRational();

		frac1 = new Rational(10, 20);
		
		
		
		frac1.invert();

		frac1.printRational();

		frac1 = new Rational(10, 20);
		
		
		
		double doubleValue = frac1.toDouble();

		System.out.println(doubleValue);

		frac1 = new Rational(10, 20);
		
		
		
		Rational justtest = frac1.reduce();
		justtest.printRational();

		frac1 = new Rational(10, 20);

		Rational justtest1 = frac1.add(frac2);
		
		justtest1.printRational();
	}

	
	public Rational(int num, int den) {
		this.numerator = num;
		this.denominator = den;
	}

	public void negate() {
		this.numerator = this.numerator * -1;
		if(this.denominator <= 0) {
			this.numerator = this.numerator * -1;
			this.denominator = this.denominator * -1;
		}
	}

	public void invert() {
		int SwapNum = this.numerator;
		int SwapDen = this.denominator;
		
		this.numerator = SwapDen;
		this.denominator = SwapNum;
	}

	public double toDouble() {
		double doubVal = (double)this.numerator / (double)this.denominator;
		return doubVal;
	}
	
	
	public Rational reduce() {
		int remain, aGCD, bGCD;
		aGCD = this.numerator;
		bGCD = this.denominator;
		remain = aGCD % bGCD;

		while(remain != 0) {
			remain = aGCD % bGCD ;
			aGCD = bGCD;
			bGCD = remain;
		}

		int theGCD = aGCD;
		
		Rational redFrac = new Rational(this.numerator/theGCD, this.denominator/theGCD);
		
		return redFrac;
	}
	
	public Rational add(Rational frac2) {
		Rational addFrac = new Rational(0, 0);
		if(this.denominator == frac2.denominator) {
			addFrac.numerator = this.numerator + frac2.numerator;
			addFrac.denominator = this.denominator;
			return addFrac;
		} 

		else {
			
			addFrac.numerator = (this.numerator * frac2.denominator) + (frac2.numerator * this.denominator);
			addFrac.denominator = this.denominator * frac2.denominator;
			int remain, aGCD, bGCD;
			aGCD = addFrac.numerator;
			bGCD = addFrac.denominator;
			remain = aGCD % bGCD;
			while(remain != 0) {
				remain = aGCD % bGCD ;
				aGCD = bGCD;
				bGCD = remain;
			}

			int theGCD = aGCD;
			
			addFrac.numerator = addFrac.numerator/theGCD;
			addFrac.denominator = addFrac.denominator/theGCD;
			
			return addFrac;
		}
	}

	
}