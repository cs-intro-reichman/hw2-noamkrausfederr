public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));
        int finalMinutes = minutes + minutesToAdd;
     
        // if the sum of the current number of minutes plus the minutes we need to add
        // is greater than 59, we need to reduct it by 60 so that it will stay in the
        // given time range, and add 1 to the hour
        if (finalMinutes > 59) {  
            while (finalMinutes > 59) {
            hours++;
            if (hours == 24) {
                hours = 0;
            }
            finalMinutes -= 60;
            minutes = 0;
            }
            minutes = finalMinutes;
        }
        // if the sum of the current number of minutes plus the minutes we need to add
        // is less than 59, we only need to change the minutes to the sum and not
        // change the hour
        else {
            minutes += minutesToAdd;
        }

        // we add a 0 infront of the minutes if its less than 10
        String min = "";
		if (minutes < 10) {
			min += "0" + minutes;
		} else {
			min += minutes;
		}
        
        // we add a 0 infront of the hours if its less than 10
        String hrs = "";
		if (hours < 10) {
			hrs += "0" + hours;
		} else {
			hrs += hours;
		}
    
        System.out.println(hrs + ":" + min);

    }
}
