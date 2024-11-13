// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int count = 1;
		String outputPrint = "";
		String newline = System.lineSeparator();
		
		// the loop repeats n times, each time starting from the seed integer and repeating the
		// actions until the seed equals 1, whilst calculating using a count how many actions
		// it took to get from the seed to 1.
		for (int i = 1; i <= n; i++) {
			
			int seed = i;
			String series = "" + seed;

			if (seed == 1) {
				seed = (seed * 3) + 1;
				series += " " + seed;
				count++;
			}

			while (seed != 1) {
				if (seed % 2 == 0) {
					seed /= 2;
				} 
				else {
					seed = (seed * 3) + 1;
				}
				count++;
				series += " " + seed;
			}

			series += " (" + count + ")";
			// this string will be the output (if the mode is 'v'), and it adds the current serie 
			// into the string and then goes down one line 
			outputPrint = outputPrint + series + newline;
			count = 1;
		}

		// i put the inputed into a char so that when i enter the letter while running the program, it will
		// recieve it properly because it reads 1 letter as a char and not a string
		char c = mode.charAt(0);
		if (c == 'v') {
			System.out.print(outputPrint);
			System.out.println("Every one of the first " + n +
							   " hailstone sequences reached 1.");
		}
		else if (c == 'c') {
			System.out.println("Every one of the first " + n +
							   " hailstone sequences reached 1.");
		}
	}
}
