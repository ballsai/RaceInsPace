package com.ballsai.mygdx.game;


import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.math.MathUtils;
public class World {
	private Player player;
	private Cars car,carLeft,carRight;
	private int score;
	private int energy;
	private boolean gameOver;
	private int n;
    World(RaceInSpaceGame raceinspaceGame) { 
        player = new Player(300,68);
        car = new Cars(300,290);
        carLeft = new Cars(300,290);
        carRight = new Cars(300,290);
        score = 0;
        energy = 100;
        gameOver = false;
        n = 0;
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
    public int getEnergy() {
    	return energy;
    }
    public void decreaseEnergy() {
    	energy -= 1;
    }
    public int getRandom() {
    	return n;
    }
    public void Random() {
    	n = MathUtils.random(1,7);
    }
    public boolean gameOver() {
    	return gameOver;
    }
    public void Over() {
    	gameOver = true;
    }
    
   
  
	
}
