package com.bamadroid.rain.level.tile;

import com.bamadroid.rain.graphics.Screen;
import com.bamadroid.rain.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile rock = new RockTile(Sprite.rock);
	//public static Tile grass_rock = new GrassRockTile(Sprite.grass_rock);
	//public static Tile red_brick = new RedBrickTile(Sprite.red_brick);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	public Tile(Sprite sprite){
		this.sprite = sprite;
	}


	public void render(int x, int y, Screen screen){
		
	}
	
	public boolean solid(){
		return false;
	}

}