// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int num = Integer.parseInt(args[0]);

	    System.out.println("pi according to Java: " + Math.PI);
		double pi;
		double sum = 1;
		double denomenator = 3.0;

		// i calculate the sum of the first num numbers in the series by understanding
		// that the series alternates between adding and subtracting, with the denominators being odd numbers
		// if im on an even index i subtract the fraction and vice versa
		for (int i = 0; i < num-1; i++)
		{
			if (i%2==0) {
				sum -= (1/denomenator);
			}
			else {
				sum += (1/denomenator);
			}
			denomenator += 2.0;
		}

		// to get the approximated pi i multiply the sum by 4
		pi = sum * 4.0;
		
		System.out.println("pi, approximated: " + pi);

	}
}
