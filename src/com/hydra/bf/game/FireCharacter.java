package com.hydra.bf.game;

import java.util.Random;

import com.hydra.bf.person.Consumptive;

public class FireCharacter extends Unit {
	
	
	public static FireCharacter draw() {
		Random random = new Random();
		float r = random.nextFloat();
		if (r < changeToGet) {
			System.out.println("抽中新火角！");
			return new FireCharacter();
		}

		System.out.println("抽到翠大姬。。");
		return null;
	}
}
