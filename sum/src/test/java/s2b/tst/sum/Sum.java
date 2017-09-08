package s2b.tst.sum;

public class Sum {

	public static double sum(double d, double e) {
		if(d<0) {
			throw new IllegalArgumentException();//comando do desenvolvedor para lançar uma Exception 
		}
		if(e<0) {
			throw new IllegalArgumentException();//comando do desenvolvedor para lançar uma Exception 
		}
		return d + e;
	
	}
	

}
