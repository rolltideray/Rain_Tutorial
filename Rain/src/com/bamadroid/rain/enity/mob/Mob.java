package com.bamadroid.rain.enity.mob;

import com.bamadroid.rain.enity.Entity;
import com.bamadroid.rain.graphics.Sprite;

public abstract class Mob extends Entity{

	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move(){
		
	}
	
	public void update(){
		
	}
	
	private boolean collision(){
		return false;
	}
}


