public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesAdd = Integer.parseInt(args[1]);
        char one = time.charAt(0);
		char two = time.charAt(1);
		char three = time.charAt(3);
		char four = time.charAt(4);
// arrays of hours and minutes
		char[] first = {one, two};
		char[] second = {three, four};
// convert from char to int
		int hours = (first[0] - '0') * 10 + (first[1] - '0');
		int minutes = (second[0] - '0') * 10 + (second[1] - '0');
// calculate hours to minutes
        int totalMinutes = (hours * 60) + minutes + minutesAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        if (newHours < 10){
 // For hours before 10           
            if (newMinutes < 10){
                System.out.println("0" + newHours + ":0" + newMinutes);
            }else{
                System.out.println("0" + newHours + ":" + newMinutes);
            }

            }else{
// For hours after 10  
                if (newMinutes < 10 ){
                    System.out.println(newHours + ":0" + newMinutes);
                }else{
                    System.out.println(newHours + ":" + newMinutes);
                }
            }    
        }

    }


