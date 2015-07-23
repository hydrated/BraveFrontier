package com.hydra.bf.probability;

import java.util.Random;

public class Probabilities {

	public static class Uniform {
		public static final float PeopleBasicDesire = 0.2f;
		
		public static float generator() {
			
			Random random = new Random();
			float r = random.nextFloat();
			if(r > PeopleBasicDesire);
			return r;
		}
	}

	public static class Geometric {
		public static float p = 0.8f;

		public static int generator() {
			int count = 0;
			Random random = new Random();
			while (random.nextFloat() < p) {
				count++;
			}

			return count;
		}
	}
}
