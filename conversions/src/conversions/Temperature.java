package conversions;

public class Temperature {

	public double F_to_C(double x){
		double a = 5.0/9.0; //constant; and the ".0" makes each a double instead of integer
			// 5/9 will equal 0 because both numbers are treated as integers
		double b = x-32;
		return a*b;
	}
	
}
