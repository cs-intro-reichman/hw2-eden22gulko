// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double pi = 0.0;
		double bottom = 1.0;

		for (int i = 0; i < num; i++){
			double fraction = 1.0 / bottom;
			if ((i % 2) == 0){
				pi = pi + fraction;
			}else{
				pi = pi - fraction;
			}
			bottom += 2.0;
		}
		pi = pi * 4.0;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi);

	}
}
