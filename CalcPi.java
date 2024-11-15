// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double even = 0.0;
		double odd = 0.0;

		for (int i = 0; i < num; i++){
			if ((i % 2) == 0){
				even = even + (1.0 / ((2 * i) + 1));
			}else{
				odd = odd + (1.0 / ((2 * i) + 1));
			}

		}
		double approximated = 4 * (even - odd);
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approximated);

	}
}
