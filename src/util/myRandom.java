package util;

import java.util.Random;

public class myRandom {
			
	private static Random random = new Random();
	
	public static int randomInt(int min, int max){
		return min + random.nextInt(max - min + 1) ;
	}
	
	public static double randomDouble(double min, double max){
		return min + random.nextDouble() * (max - min);
	}
}
