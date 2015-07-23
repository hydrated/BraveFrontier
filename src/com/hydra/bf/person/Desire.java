package com.hydra.bf.person;

import java.util.Random;

import com.hydra.bf.probability.Probabilities;

public class Desire {

	public float probability;

	public static Desire create() {
		Desire desire = new Desire();

		desire.probability = Probabilities.Uniform.generator();

		return desire;
	}

	public boolean isDesirable() {
		Random random = new Random();
		float r = random.nextFloat();
		if (r > probability) {
			System.out.println("受不了誘惑了！抽！");
			return true;
		} else {
			System.out.println("忍住！");
		}
		return false;
	}
}
