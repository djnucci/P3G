import java.util.Scanner;

public class dwitesep09p1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] line1 = {read.nextInt(), read.nextInt()};
		int[] line2 = {read.nextInt(), read.nextInt()};
		int[] line3 = {read.nextInt(), read.nextInt()};
		int[] line4 = {read.nextInt(), read.nextInt()};
		int[] line5 = {read.nextInt(), read.nextInt()};
		
		for (int i = line1[0]; i < line1[1]; i++){
			String stringOfI = String.valueOf(i);
			char[] splitI = new char[7];
			for (int j = 0; j < splitI.length; j++){
				splitI[j] = '0';
			}	
		}
	}
}
