package com.hydra.bf.person;

import java.util.ArrayList;

import com.hydra.bf.game.FireCharacter;
import com.hydra.bf.game.Unit;

public class People {
	private String name = "";
	private Consumptive consumptive;
	private Desire desire;
	private int count = 0;
	private ArrayList<Unit> Characters;

	public People() {
		this("Unknown");
	}
	
	public People(String name) {
		this.name = name;
		consumptive = Consumptive.create();
		desire = Desire.create();
		Characters = new ArrayList<Unit>();
	}
	
	public void startDrawingExclamation() {
		System.out.println("The man \"" + name + "\" is about to draw characters");
		System.out.println("目標新火！");
		while(Characters.isEmpty()) {
			if(isDraw()) {
				Unit newUnit = FireCharacter.draw();
				if(newUnit != null) {
					Characters.add(newUnit);
				}
			} else {
				break;
			}
		}
	}
	
	
	public boolean isDraw() {
		if(desire.isDesirable() && consumptive.isConsumable()) {
			return true;
		}
		return false;
	}
}
