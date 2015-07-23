package com.hydra.bf.person;

import com.hydra.bf.probability.Probabilities;

public class Consumptive {

	public int probability;
	public int count = 0 ;
	
	
	public static Consumptive create() {
		Consumptive consumptive = new Consumptive() ;
		
		consumptive.probability = Probabilities.Geometric.generator();
		return consumptive;
	}
	
	public boolean isConsumable() {
		if(count < probability) {
			System.out.println("老子我有錢！抽！");
			count++;
			return true;
		}
		System.out.println("幹！沒錢了！");
		return false; 
		
	}
}
