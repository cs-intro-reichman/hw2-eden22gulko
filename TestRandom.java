// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	int num = Integer.parseInt(args[0]);
	int countBig = 0;
	int countSmall = 0;

	for (int i = 0; i < num ; i++ ){
		double times = Math.random();
		if (times > 0.5){
			countBig++;
			
		}else{
			countSmall++;
			
		}
		}

		System.out.println("> 0.5:  " + countBig + " times");
		System.out.println("<= 0.5: " + countSmall+ " times");

	}
	
	}

