package edu.yu.intro;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
public class Rational
{
int demoninator;
int numerator;
public Rational()
{
	
	this.demoninator=1;
	this.numerator=0;
}
public Rational(int numerator,int demoninator)
{
	if(demoninator==0)
	{
		throw new IllegalArgumentException();
	}
	this.demoninator=demoninator;
	this.numerator=numerator;
}
public String printRational()
{
	if(numerator/demoninator>=0)
	{
		return "Number is Positive.";
	}
	else
	{
		return "Number is Negative.";
	}	
}
public int getNumerator ()
{
	return numerator;
}
public int getDenominator ()
{
	return demoninator;
}

public void negate ()
{
	
	demoninator=-1*demoninator;
		
}

public void invert ()
{
	int demoninator1=demoninator;
	demoninator=numerator;
	numerator=demoninator1;
	if(demoninator==0)
	{
		throw new UnsupportedOperationException();
	}
}

public double toDouble ()
{
	double convert = (double)numerator/(double)demoninator;
	return convert;
}

public Rational reduce()
{
	
	double numerator2 =numerator;
	double demoninator2=demoninator;
	int GCD =0;
	
	for(int i=0;i<demoninator2;i++)
	{
		if((numerator2%i==0) && (demoninator2%i==0))
		{
			GCD=i;
		}
	}
	Rational reducer = new Rational((int)numerator2/(int)GCD,(int)demoninator2/(int)GCD);
	return reducer;

}

public Rational add(final Rational that)
{
	int NumeratorInput = that.getNumerator(); //this will store numerator of argument object
	int DenominatorInput = that.getDenominator();//this will store demoninator of argument object
	int DenominatorRegular = demoninator; //this stores demoninator of instance object
	int NumeratorRegular = numerator; //this stores numerator of instance object
	NumeratorInput*=DenominatorRegular;
	DenominatorInput*=DenominatorRegular;
	DenominatorRegular*=that.getDenominator();
	NumeratorRegular*=that.getDenominator();
	int NumeratorOutPut =NumeratorInput+NumeratorRegular;
	int DenominatorOutPut=DenominatorRegular; //last two numbers are added fractions after being equlaized
	int NumeratorOutPut1 =NumeratorOutPut;
	int DenominatorOutPut1=DenominatorOutPut;
	int GCD =0;
	 while (DenominatorOutPut1!=0){
       GCD = DenominatorOutPut1; 
       DenominatorOutPut1 = NumeratorOutPut1%DenominatorOutPut1; 
       NumeratorOutPut1 = GCD; 
	 }
	Rational addReduce = new Rational(NumeratorOutPut/NumeratorOutPut1,DenominatorOutPut/NumeratorOutPut1);
	return addReduce;

	}


}