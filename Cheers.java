// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheer = args[0];
            int times = Integer.parseInt(args[1]);
            String specialCase = "";
        
            // a string consisting of all the letter that we need to check if exist
            // in the cheer string
            String letters = "AEFHILMNORSX";

            for (int i = 0; i < cheer.length(); i++)
            {
                // check if the letter of the cheer is part of the string consisting
                // of the letters that are a special case, if so we add an "an" before them
                // and not an "a",
                if (letters.indexOf(cheer.charAt(i)) == -1) {
                        specialCase = "a ";
                }
                else {
                        specialCase = "an";
                }
                System.out.println("Give me " + specialCase + " " + 
                                  cheer.charAt(i) + ": " +
                                  cheer.charAt(i) + "!");
            }

            System.out.println("What does that spell?");   
            while (times > 0)
            {
                times--;       
                System.out.println(cheer + "!!!");              
            }

        }
}
