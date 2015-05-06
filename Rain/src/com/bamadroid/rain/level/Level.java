package com.bamadroid.rain.level;

import com.bamadroid.rain.graphics.Screen;
import com.bamadroid.rain.level.tile.Tile;

public class Level {
	
	protected int width, height;
	protected int[] tilesInt;
	protected int[] tiles;
	
	public Level(int width, int height){
		
		this.width = width;
		this.height = height;
		tilesInt = new int[width * height];
		generateLevel();
	}
	
	public Level(String path){
		loadLevel(path);
		generateLevel();
	}

	protected void generateLevel() {
		
	}

	protected void loadLevel(String path) {
	}
	
	public void update(){
		
	}
	
	private void time(){
		
	}
	
	public void render(int xScroll, int yScroll, Screen screen){
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = ((xScroll  + screen.width) >> 4) + 16;
		int y0 = yScroll >> 4;
		int y1 = ((yScroll  + screen.height) >> 4) + 16;
		
		for (int y = y0; y < y1; y++){
			for (int x = x0; x < x1; x++){
				getTile(x, y).render(x, y, screen);
			}
		}
		
	}
	// Grass = 0xff00ff00
		// Flower = 0xffffff00
		// Rock = 0xff7f7f00
	
	public Tile getTile(int x, int y){
		if (x < 0 ||x >= width || y < 0 || y >= height) return Tile.voidTile;
		System.out.println("Good");
		if (tiles[x + y * width] == 0xff00ff00) return Tile.grass;
		if (tiles[x + y * width] == 0xffffff00) return Tile.flower;
		if (tiles[x + y * width] == 0xff7f7f00) return Tile.rock;
		return Tile.voidTile;
	}
	
}
