package com.ballsai.mygdx.game;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class World {
	private Player player;
	private Cars car,carLeft,carRight;
	private int score;
	
    World(RaceInSpaceGame raceinspaceGame) { 
        player = new Player(300,68);
        car = new Cars(300,290);
        carLeft = new Cars(300,290);
        carRight = new Cars(300,290);
        score = 0;
}
   
    Player getPlayer() {
        return player;
    }
    
    Cars getCar() {
        return car;
    }
    Cars getCarLeft() {
    	return carLeft;
    }
    Cars getCarRight() {
    	return carRight;
    }
    
    public int getScore() {
        return score;
    }
    public void increaseScore() {
        score += 1;
    }
    
   
  
	
}
