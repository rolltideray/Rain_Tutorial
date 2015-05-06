package com.bamadroid.rain.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpawnLevel extends Level {
	
	public SpawnLevel(String path) {
		super(path);
	}
	
	protected void loadLevel(String path){
		try{
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = width = image.getWidth();
			int h = height = image.getHeight();
			tiles = new int[w * h];
			image.getRGB(0, 0, w, h, tiles, 0, w);
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("Exceptio! Could not load level file!");
		}
	}
	
	// Grass = 0xff00ff00
	// Flower = 0xffffff00
	// Rock = 0xff7f7f00
	protected void generateLevel(){	
	}

}
