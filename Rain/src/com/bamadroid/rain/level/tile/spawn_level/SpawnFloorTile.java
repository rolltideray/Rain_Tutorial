package com.bamadroid.rain.level.tile.spawn_level;

import com.bamadroid.rain.graphics.Screen;
import com.bamadroid.rain.graphics.Sprite;
import com.bamadroid.rain.level.tile.Tile;

public class SpawnFloorTile extends Tile {

	public SpawnFloorTile(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	
	public void render(int x, int y, Screen screen){
		screen.renderTile(x << 4, y << 4, this);
	}

}
