package edu.yu.intro;
public class RationalNumbers
{
public static void main(String[] args)
{
	Rational rational = new Rational(6,10);
	System.out.println(rational.printRational());
	rational.negate();
	System.out.println(rational.printRational());
	rational.invert();
	System.out.println(rational.printRational());
	Rational rational1 = new Rational(((rational.reduce()).getNumerator()),((rational.reduce()).getDenominator()));
	System.out.println(rational1.getNumerator()+ " " +rational1.getDenominator());
	Rational rational2 =new Rational(5,12);
	Rational rational3 = rational.add(rational2);
	int f =rational3.getNumerator();
	int r =rational3.getDenominator();
		System.out.println(f+ " " + r);
	
}
}