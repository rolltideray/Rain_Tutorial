package com.bamadroid.rain.level.tile;

import com.bamadroid.rain.graphics.Screen;
import com.bamadroid.rain.graphics.Sprite;

public class VoidTile extends Tile {
	public VoidTile(Sprite sprite) {
		super(sprite);
	}
	public void render(int x, int y, Screen screen){
		screen.renderTile(x << 4, y << 4, this);
	}

}
