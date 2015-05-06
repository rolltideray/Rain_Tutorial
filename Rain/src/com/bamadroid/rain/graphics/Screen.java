package com.bamadroid.rain.graphics;

import java.util.Random;

import com.bamadroid.rain.enity.mob.Player;
import com.bamadroid.rain.level.tile.Tile;

public class Screen {
	
	public int width, height; 
	public int[] pixels;
	public final int MAP_SIZE = 64;
	public int xOffset, yOffset;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;
	public int[] tiles = new int[MAP_SIZE * MAP_SIZE];
	
	
	
	private Random random = new Random();
	
	public Screen(int width, int height){
		this.width = width;
		this.height = height;
		
		pixels = new int[width * height]; // 0 - 50, 399 = 50,400
		
		for (int i=0; i < MAP_SIZE * MAP_SIZE; i++){
			tiles[i] = random.nextInt(0xffffff);
			//tiles[0] = 0;
		}
	}
	
	public void clear(){
		for(int i = 0; i < pixels.length;i++){
			pixels[i] = 0;
		}
	}
	
	
	public void renderTile(int xp, int yp, Tile tile){
		xp -= xOffset;
		yp -= yOffset;
		for (int y = 0; y < tile.sprite.SIZE; y++){
			int ya = y + yp;
			for (int x = 0; x < tile.sprite.SIZE; x++){
				int xa = x + xp;
				//if(xa < 0 || xa >= width || ya < 0 || ya >= width)break; // keep you from rendering what you can see on your screen
				if (xa < -tile.sprite.SIZE || xa >= this.width || ya < 0 || ya >= this.height) break;
				if(xa < 0){
					xa = 0;
				}
				pixels[xa + ya * width] = tile.sprite.pixels[x + y  * tile.sprite.SIZE];
				
			}
		}
	}
	
	public void renderPlayer(int xp, int yp, Sprite sprite){
		xp -= xOffset;
		yp -= yOffset;
		for (int y = 0; y < Sprite.player.SIZE; y++){
			int ya = y + yp;
			for (int x = 0; x < Sprite.player.SIZE; x++){
				int xa = x + xp;
				if (xa < -Sprite.player.SIZE || xa >= this.width || ya < 0 || ya >= this.height) break;
				if(xa < 0) xa = 0;
				int col = sprite.pixels[x + y  * Sprite.player.SIZE];
				if (col != 0xFFFF00FF) pixels[xa + ya * this.width] = col;
				
			}
		}
	}
	
	public void setOffset(int xOffset, int yOffset){
		this.xOffset = xOffset;
		this. yOffset = yOffset;
	}
	
}
