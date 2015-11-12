package conversions;

public class Temperature {

	public double F_to_C(double x){
		double a = 5.0/9.0; //constant
		double b = x-32;
		return a*b;
	}
	
}
