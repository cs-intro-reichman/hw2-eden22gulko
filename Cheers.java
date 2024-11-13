// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0].toUpperCase();
            int number = Integer.parseInt(args[1]);
            String no = "AEFHILMNORSX";
            

            for(int i = 0; i < name.length(); i++){
                char letter = name.charAt(i); 
                String a = "a ";

                if (no.indexOf(letter) != -1) {
                        a = "an";

                }
                System.out.println("Give me " + a + " " + letter + ": " + letter + "!");
            }
            System.out.println("What does that spell?");
            for(int i = 0; i < number; i++){
                System.out.println(name + "!!!");
            }


            
        }
}
