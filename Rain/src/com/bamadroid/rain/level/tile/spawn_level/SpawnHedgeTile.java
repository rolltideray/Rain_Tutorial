package com.bamadroid.rain.level.tile.spawn_level;

import com.bamadroid.rain.graphics.Screen;
import com.bamadroid.rain.graphics.Sprite;
import com.bamadroid.rain.level.tile.Tile;

public class SpawnHedgeTile extends Tile {

	public SpawnHedgeTile(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	
	public void render(int x, int y, Screen screen){
		screen.renderTile(x << 4, y << 4, this);
	}
	
	public boolean solid(){
		return true;
	}
	
	public boolean breakable(){
		return true;
	}

}
