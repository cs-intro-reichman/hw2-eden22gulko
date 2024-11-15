// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int times = Integer.parseInt(args[0]);
	String vc = args[1];
	String steps; 
	
	
	for (int i = 1; i <= times ; i++ ){
		int num = i; 
		int count = 1;
		steps = "";

		do{
			steps += num + " ";
			if ((num % 2) == 0){
				num = num / 2;
			}else{
				num = (num * 3) + 1;
			}

		count++;
	
		}while (num != 1);
		
		steps += num + " (" + count + ")";
		if (vc.equals("v")){
			System.out.println(steps);
		}
	 }

	 System.out.println("Every one of the first " + times + " hailstone sequences reached 1.");
	 
    }

  }

  

  
	
