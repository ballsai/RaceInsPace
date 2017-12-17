package com.ballsai.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class Cars {
	 private Vector2 position;
	 
	 public Cars(int x, int y) {
	       position = new Vector2(x,y);
	    }    
	 public Vector2 getPosition() {
	        return position;    
	    }
}
